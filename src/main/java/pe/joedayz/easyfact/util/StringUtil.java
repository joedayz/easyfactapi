package pe.joedayz.easyfact.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by josediaz on 28/10/2016.
 */
public class StringUtil {

	private static final Logger LOG = LoggerFactory.getLogger(StringUtil.class);
	public static final String LINE_SEP = System.getProperty("line.separator");

	private static final String[] UNIDADES = { "", "UN ", "DOS ", "TRES ", "CUATRO ", "CINCO ", "SEIS ", "SIETE ",
			"OCHO ", "NUEVE ", "DIEZ ", "ONCE ", "DOCE ", "TRECE ", "CATORCE ", "QUINCE ", "DIECISEIS", "DIECISIETE",
			"DIECIOCHO", "DIECINUEVE", "VEINTE" };

	private static final String[] DECENAS = { "VENTI", "TREINTA ", "CUARENTA ", "CINCUENTA ", "SESENTA ", "SETENTA ",
			"OCHENTA ", "NOVENTA ", "CIEN " };

	private static final String[] CENTENAS = { "CIENTO ", "DOSCIENTOS ", "TRESCIENTOS ", "CUATROCIENTOS ",
			"QUINIENTOS ", "SEISCIENTOS ", "SETECIENTOS ", "OCHOCIENTOS ", "NOVECIENTOS " };

	public static boolean hasText(String str) {
		return StringUtils.hasText(str);
	}

	public static String concat(Collection list, String sep) {
		return concat(list, sep, null);
	}

	public static String concat(Collection list, String sep, String enclosing) {
		StringBuilder buf = new StringBuilder();
		for (Object str : list) {
			if (buf.length() > 0) {
				buf.append(sep);
			}
			if (enclosing != null) {
				buf.append(enclosing);
			}
			buf.append(str);
			if (enclosing != null) {
				buf.append(enclosing);
			}
		}
		return buf.toString();
	}

	public static String nvl(String s1, String s2) {
		return hasText(s1) ? s1 : s2;
	}

	public static String regionExtract(StringBuffer buf, String startRegion, String endRegion, String replacement) {
		int idxStart = startRegion == null ? 0 : buf.indexOf(startRegion);
		if (idxStart == -1)
			throw new IllegalArgumentException("Region start " + startRegion + " no encontrado en " + buf);
		int idxEnd = buf.indexOf(endRegion);
		if (idxEnd == -1) {
			throw new IllegalArgumentException("Region start " + endRegion + " no encontrado en " + buf);
		}
		String regionExtract = buf.substring(idxStart + (startRegion == null ? 0 : startRegion.length()), idxEnd);
		buf.replace(idxStart, idxEnd + endRegion.length(), replacement);
		return regionExtract;
	}

	public static String trunc(String str, int maxLenght) {
		return str == null || str.length() < maxLenght ? str : str.substring(0, maxLenght);
	}

	public static boolean isEmpty(String str) {
		return !hasText(str);
	}

	public CharSequence removeStartEndLineFeed(CharSequence str) {
		StringBuffer buf = str instanceof StringBuffer ? (StringBuffer) str : new StringBuffer(str);
		if (buf.charAt(0) == 13 || buf.charAt(0) == 10) {
			buf.deleteCharAt(0);
		}
		if (buf.charAt(buf.length() - 1) == 13 || buf.charAt(buf.length() - 1) == 10)
			buf.deleteCharAt(buf.length() - 1);
		return buf;
	}

	public static String replaceFull(String str, Map<String, String> params) {
		StringBuffer buf = new StringBuffer(str);
		for (String valueOld : params.keySet()) {
			LOG.debug("Aplicando parametro " + valueOld + " " + params.get(valueOld));
			String valueNew = params.get(valueOld);
			replace(buf, valueOld, valueNew);
		}
		return buf.toString();
	}

	public static StringBuffer replace(StringBuffer buf, String valueOld, String valueNew) {
		while (true) {
			int idx = buf.indexOf(valueOld);
			if (idx == -1) {
				break;
			}
			buf.replace(idx, idx + valueOld.length(), valueNew);
		}
		return buf;

	}

	public static String replace(String buf, String valueOld, String valueNew) {
		return replace(new StringBuffer(buf), valueOld, valueNew).toString();
	}

	public static int lineCount(String str) {
		int idx = 0;
		int count = 0;
		while (true) {
			idx = str.indexOf(LINE_SEP, idx + 1);
			if (idx < 0) {
				break;
			}
			count++;
		}
		return count;
	}

	public static Integer parseIntNull(String str) {
		try {
			return Integer.valueOf(str);
		} catch (NumberFormatException e) {
			return null;
		}
	}

	public static Long parseLongNull(String val) {
		if (val == null) {
			return null;
		}
		try {
			return Long.valueOf(val);
		} catch (NumberFormatException e) {
			return null;
		}
	}

	public static BigDecimal parseBigDecimalNull(String str) {
		try {
			return new BigDecimal(str);
		} catch (NumberFormatException e) {
			return null;
		}
	}

	public static boolean validateTextWithPattern(String texto, String patternStr) {
		boolean isCorrect = false;
		Pattern pattern = null;
		Matcher matcher = null;
		try {
			if (texto != null && patternStr != null) {
				pattern = Pattern.compile(patternStr);
				matcher = pattern.matcher(texto);

				if (matcher.find()) {
					isCorrect = true;
				}
			}
			return isCorrect;
		} catch (Exception e) {
			LOG.error("Error in validateTextWithPattern", e);
		}
		return isCorrect;
	}

	public static String trim(String str) {
		return str == null ? null : str.trim();
	}

	public static List<String> split(String str, String... delims) {
		StringBuilder buf = new StringBuilder(str == null ? "" : str.trim());
		List<String> result = new ArrayList<>();
		while (buf.length() > 0) {
			String valToAdd;
			int idx = firstIdx(buf.toString(), null, delims);
			if (idx < 0) {
				idx = buf.length();
			}
			valToAdd = buf.substring(0, idx);
			buf.replace(0, idx + 1, ""); // remover
			valToAdd = StringUtil.trim(valToAdd);
			if (StringUtil.hasText(valToAdd)) {
				result.add(valToAdd);
			}
		}
		return result;
	}

	public static int firstIdx(String str, Integer fromIdx, String... delims) {
		if (fromIdx == null) {
			fromIdx = 0;
		}
		int bestIdx = -1;
		for (String delim : delims) {
			int idx = str.indexOf(delim, fromIdx);
			if (idx != -1 && (bestIdx == -1 || idx < bestIdx)) {
				bestIdx = idx;
			}
		}
		return bestIdx;
	}

	public static List<String> upperCase(List<String> list) {
		for (int i = 0; i < list.size(); i++) {
			list.set(i, list.get(i).toUpperCase());
		}
		return list;
	}

	public static String toJavaName(String dbColName) {
		String[] parts = dbColName.toLowerCase().trim().split("_");
		for (int i = 1; i < parts.length; i++) {
			String part = parts[i];
			if (part.length() > 0)
				parts[i] = part.substring(0, 1).toUpperCase() + (part.length() > 1 ? part.substring(1) : "");
		}
		return concat(Arrays.asList(parts), "");
	}

	public static String last(String str, int size) {
		int length = str.length();
		if (length <= size) {
			return str;
		} else
			return str.substring(length - size);
	}

	public static boolean eq(String str1, String str2) {
		if (str1 != null && str2 != null) {
			return str1.equals(str2);
		} else
			return str1 == null && str2 == null;
	}

	public static String trimEnd(String value) {
		// Use replaceFirst to remove trailing spaces.
		return value.replaceFirst("\\s+$", "");
	}

	public static String trimStart(String value) {
		// Remove leading spaces.
		if (value == null) {
			return "";
		}

		return value.replaceFirst("^\\s+", "");
	}

	public static String formatoHoraArchivoMarcacion(String value) {

		if (value == null || value.trim().length() == 0) {
			return "";
		}

		String hora = value.substring(0, 2);
		String minuto = value.substring(2, 4);

		return hora + ":" + minuto;
	}

	public static String obtenerCodigoDia(int diaDeSemana) {
		String cadena = "";
		switch (diaDeSemana) {
		case 1:
			cadena = "DO";
			break;
		case 2:
			cadena = "LU";
			break;
		case 3:
			cadena = "MA";
			break;
		case 4:
			cadena = "MI";
			break;
		case 5:
			cadena = "JU";
			break;
		case 6:
			cadena = "VI";
			break;
		case 7:
			cadena = "SA";
			break;
		default:
			cadena = "";
			break;
		}

		return cadena;
	}

	public static String autocompleteZeroLeft(String value) {
		String result = "";

		if (value != null && !value.equals("")) {
			if (value.length() == 1) {
				result = "0" + value;
			} else {
				result = value;
			}
		}

		return result;
	}

	public static String toCamelCase(String value) {

		String result = "";

		if (value == null || value.equals("")) {
			return result;
		}

		value = value.trim().toLowerCase();

		String[] values = value.split(" ");

		for (String val : values) {

			String firstLetter = val.substring(0, 1);
			firstLetter = firstLetter.toUpperCase();
			String sub = firstLetter.concat(val.substring(1, val.length()));
			result = result + sub + " ";
		}

		return result;
	}

	public static String convertNumberToLetter(String number) throws NumberFormatException {
		return convertNumberToLetter(Double.parseDouble(number));
	}

	public static String convertNumberToLetter(double doubleNumber) throws NumberFormatException {

		StringBuilder converted = new StringBuilder();

		String patternThreeDecimalPoints = "#.###";

		DecimalFormat format = new DecimalFormat(patternThreeDecimalPoints);
		format.setRoundingMode(RoundingMode.DOWN);

		// formateamos el numero, para ajustarlo a el formato de tres puntos
		// decimales
		String formatedDouble = format.format(doubleNumber);
		doubleNumber = Double.parseDouble(formatedDouble);

		// Validamos que sea un numero legal
		if (doubleNumber > 999999999)
			throw new NumberFormatException("El numero es mayor de 999'999.999, " + "no es posible convertirlo");

		if (doubleNumber < 0)
			throw new NumberFormatException("El numero debe ser positivo");

		String splitNumber[] = String.valueOf(doubleNumber).replace('.', '#').split("#");

		// Descompone el trio de millones
		int millon = Integer.parseInt(String.valueOf(getDigitAt(splitNumber[0], 8))
				+ String.valueOf(getDigitAt(splitNumber[0], 7)) + String.valueOf(getDigitAt(splitNumber[0], 6)));
		if (millon == 1)
			converted.append("UN MILLON ");
		else if (millon > 1)
			converted.append(convertNumber(String.valueOf(millon))).append("MILLONES ");

		// Descompone el trio de miles
		int miles = Integer.parseInt(String.valueOf(getDigitAt(splitNumber[0], 5))
				+ String.valueOf(getDigitAt(splitNumber[0], 4)) + String.valueOf(getDigitAt(splitNumber[0], 3)));
		if (millon >= 1) {
			if (miles == 1)
				converted.append(convertNumber(String.valueOf(miles))).append("MIL ");
			else if (miles > 1)
				converted.append(convertNumber(String.valueOf(miles))).append("MIL ");
		} else {
			if (miles == 1)
				converted.append("UN MIL ");

			if (miles > 1)
				converted.append(convertNumber(String.valueOf(miles))).append("MIL ");
		}

		// Descompone el ultimo trio de unidades
		int cientos = Integer.parseInt(String.valueOf(getDigitAt(splitNumber[0], 2))
				+ String.valueOf(getDigitAt(splitNumber[0], 1)) + String.valueOf(getDigitAt(splitNumber[0], 0)));
		if (miles >= 1 || millon >= 1) {
			if (cientos >= 1)
				converted.append(convertNumber(String.valueOf(cientos)));
		} else {
			if (cientos == 1)
				converted.append("UN ");
			if (cientos > 1)
				converted.append(convertNumber(String.valueOf(cientos)));
		}

		if (millon + miles + cientos == 0)
			converted.append("CERO ");

		// Descompone los centavos
		String valor = splitNumber[1];
		if (valor.length() == 1) {
			converted.append(splitNumber[1]).append("0").append("/100 ");
		} else {
			converted.append(splitNumber[1]).append("/100 ");
		}
		//converted.append("U.S. DOLARES**");
		return converted.toString();
	}

	private static String convertNumber(String number) {

		if (number.length() > 3)
			throw new NumberFormatException("La longitud maxima debe ser 3 digitos");

		// Caso especial con el 100
		if (number.equals("100")) {
			return "CIEN ";
		}

		StringBuilder output = new StringBuilder();
		if (getDigitAt(number, 2) != 0)
			output.append(CENTENAS[getDigitAt(number, 2) - 1]);

		int k = Integer.parseInt(String.valueOf(getDigitAt(number, 1)) + String.valueOf(getDigitAt(number, 0)));

		if (k <= 20)
			output.append(UNIDADES[k]);
		else if (k > 30 && getDigitAt(number, 0) != 0)
			output.append(DECENAS[getDigitAt(number, 1) - 2]).append("Y ").append(UNIDADES[getDigitAt(number, 0)]);
		else
			output.append(DECENAS[getDigitAt(number, 1) - 2]).append(UNIDADES[getDigitAt(number, 0)]);

		return output.toString();
	}

	private static int getDigitAt(String origin, int position) {
		if (origin.length() > position && position >= 0)
			return origin.charAt(origin.length() - position - 1) - 48;
		return 0;
	}

}