// $ANTLR 3.0.1 ECL.g 2008-07-23 13:38:31

package com.okooo.osgi.ecl;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class ECLLexer extends Lexer {
	public static final int WS = 7;
	public static final int NEWLINE = 4;
	public static final int T10 = 10;
	public static final int T11 = 11;
	public static final int T12 = 12;
	public static final int T13 = 13;
	public static final int T8 = 8;
	public static final int DIGIT = 5;
	public static final int T14 = 14;
	public static final int T9 = 9;
	public static final int T15 = 15;
	public static final int Tokens = 18;
	public static final int T16 = 16;
	public static final int EOF = -1;
	public static final int T17 = 17;
	public static final int ALPHA = 6;

	public ECLLexer() {
		;
	}

	public ECLLexer(CharStream input) {
		super(input);
	}

	public String getGrammarFileName() {
		return "ECL.g";
	}

	// $ANTLR start T8
	public final void mT8() throws RecognitionException {
		try {
			int _type = T8;
			// ECL.g:6:4: ( ';' )
			// ECL.g:6:6: ';'
			{
				match(';');

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end T8

	// $ANTLR start T9
	public final void mT9() throws RecognitionException {
		try {
			int _type = T9;
			// ECL.g:7:4: ( 'update' )
			// ECL.g:7:6: 'update'
			{
				match("update");

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end T9

	// $ANTLR start T10
	public final void mT10() throws RecognitionException {
		try {
			int _type = T10;
			// ECL.g:8:5: ( 'start' )
			// ECL.g:8:7: 'start'
			{
				match("start");

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end T10

	// $ANTLR start T11
	public final void mT11() throws RecognitionException {
		try {
			int _type = T11;
			// ECL.g:9:5: ( 'stop' )
			// ECL.g:9:7: 'stop'
			{
				match("stop");

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end T11

	// $ANTLR start T12
	public final void mT12() throws RecognitionException {
		try {
			int _type = T12;
			// ECL.g:10:5: ( 'restart' )
			// ECL.g:10:7: 'restart'
			{
				match("restart");

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end T12

	// $ANTLR start T13
	public final void mT13() throws RecognitionException {
		try {
			int _type = T13;
			// ECL.g:11:5: ( 'install ' )
			// ECL.g:11:7: 'install '
			{
				match("install ");

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end T13

	// $ANTLR start T14
	public final void mT14() throws RecognitionException {
		try {
			int _type = T14;
			// ECL.g:12:5: ( ',' )
			// ECL.g:12:7: ','
			{
				match(',');

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end T14

	// $ANTLR start T15
	public final void mT15() throws RecognitionException {
		try {
			int _type = T15;
			// ECL.g:13:5: ( '.' )
			// ECL.g:13:7: '.'
			{
				match('.');

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end T15

	// $ANTLR start T16
	public final void mT16() throws RecognitionException {
		try {
			int _type = T16;
			// ECL.g:14:5: ( '_' )
			// ECL.g:14:7: '_'
			{
				match('_');

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end T16

	// $ANTLR start T17
	public final void mT17() throws RecognitionException {
		try {
			int _type = T17;
			// ECL.g:15:5: ( '-' )
			// ECL.g:15:7: '-'
			{
				match('-');

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end T17

	// $ANTLR start DIGIT
	public final void mDIGIT() throws RecognitionException {
		try {
			int _type = DIGIT;
			// ECL.g:88:7: ( ( '0' .. '9' )+ )
			// ECL.g:88:9: ( '0' .. '9' )+
			{
				// ECL.g:88:9: ( '0' .. '9' )+
				int cnt1 = 0;
				loop1: do {
					int alt1 = 2;
					int LA1_0 = input.LA(1);

					if (((LA1_0 >= '0' && LA1_0 <= '9'))) {
						alt1 = 1;
					}

					switch (alt1) {
					case 1:
						// ECL.g:88:10: '0' .. '9'
					{
						matchRange('0', '9');

					}
						break;

					default:
						if (cnt1 >= 1)
							break loop1;
						EarlyExitException eee = new EarlyExitException(1,
								input);
						throw eee;
					}
					cnt1++;
				} while (true);

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end DIGIT

	// $ANTLR start ALPHA
	public final void mALPHA() throws RecognitionException {
		try {
			int _type = ALPHA;
			// ECL.g:90:7: ( 'a' .. 'z' | 'A' .. 'Z' )
			// ECL.g:
			{
				if ((input.LA(1) >= 'A' && input.LA(1) <= 'Z')
						|| (input.LA(1) >= 'a' && input.LA(1) <= 'z')) {
					input.consume();

				} else {
					MismatchedSetException mse = new MismatchedSetException(
							null, input);
					recover(mse);
					throw mse;
				}

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end ALPHA

	// $ANTLR start NEWLINE
	public final void mNEWLINE() throws RecognitionException {
		try {
			int _type = NEWLINE;
			// ECL.g:93:9: ( ( '\\r' )? '\\n' )
			// ECL.g:93:11: ( '\\r' )? '\\n'
			{
				// ECL.g:93:11: ( '\\r' )?
				int alt2 = 2;
				int LA2_0 = input.LA(1);

				if ((LA2_0 == '\r')) {
					alt2 = 1;
				}
				switch (alt2) {
				case 1:
					// ECL.g:93:11: '\\r'
				{
					match('\r');

				}
					break;

				}

				match('\n');

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end NEWLINE

	// $ANTLR start WS
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			// ECL.g:96:4: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
			// ECL.g:96:6: ( ' ' | '\\t' | '\\r' | '\\n' )+
			{
				// ECL.g:96:6: ( ' ' | '\\t' | '\\r' | '\\n' )+
				int cnt3 = 0;
				loop3: do {
					int alt3 = 2;
					int LA3_0 = input.LA(1);

					if (((LA3_0 >= '\t' && LA3_0 <= '\n') || LA3_0 == '\r' || LA3_0 == ' ')) {
						alt3 = 1;
					}

					switch (alt3) {
					case 1:
						// ECL.g:
					{
						if ((input.LA(1) >= '\t' && input.LA(1) <= '\n')
								|| input.LA(1) == '\r' || input.LA(1) == ' ') {
							input.consume();

						} else {
							MismatchedSetException mse = new MismatchedSetException(
									null, input);
							recover(mse);
							throw mse;
						}

					}
						break;

					default:
						if (cnt3 >= 1)
							break loop3;
						EarlyExitException eee = new EarlyExitException(3,
								input);
						throw eee;
					}
					cnt3++;
				} while (true);

				skip();

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end WS

	public void mTokens() throws RecognitionException {
		// ECL.g:1:8: ( T8 | T9 | T10 | T11 | T12 | T13 | T14 | T15 | T16 | T17
		// | DIGIT | ALPHA | NEWLINE | WS )
		int alt4 = 14;
		switch (input.LA(1)) {
		case ';': {
			alt4 = 1;
		}
			break;
		case 'u': {
			int LA4_2 = input.LA(2);

			if ((LA4_2 == 'p')) {
				alt4 = 2;
			} else {
				alt4 = 12;
			}
		}
			break;
		case 's': {
			int LA4_3 = input.LA(2);

			if ((LA4_3 == 't')) {
				int LA4_16 = input.LA(3);

				if ((LA4_16 == 'a')) {
					alt4 = 3;
				} else if ((LA4_16 == 'o')) {
					alt4 = 4;
				} else {
					NoViableAltException nvae = new NoViableAltException(
							"1:1: Tokens : ( T8 | T9 | T10 | T11 | T12 | T13 | T14 | T15 | T16 | T17 | DIGIT | ALPHA | NEWLINE | WS );",
							4, 16, input);

					throw nvae;
				}
			} else {
				alt4 = 12;
			}
		}
			break;
		case 'r': {
			int LA4_4 = input.LA(2);

			if ((LA4_4 == 'e')) {
				alt4 = 5;
			} else {
				alt4 = 12;
			}
		}
			break;
		case 'i': {
			int LA4_5 = input.LA(2);

			if ((LA4_5 == 'n')) {
				alt4 = 6;
			} else {
				alt4 = 12;
			}
		}
			break;
		case ',': {
			alt4 = 7;
		}
			break;
		case '.': {
			alt4 = 8;
		}
			break;
		case '_': {
			alt4 = 9;
		}
			break;
		case '-': {
			alt4 = 10;
		}
			break;
		case '0':
		case '1':
		case '2':
		case '3':
		case '4':
		case '5':
		case '6':
		case '7':
		case '8':
		case '9': {
			alt4 = 11;
		}
			break;
		case 'A':
		case 'B':
		case 'C':
		case 'D':
		case 'E':
		case 'F':
		case 'G':
		case 'H':
		case 'I':
		case 'J':
		case 'K':
		case 'L':
		case 'M':
		case 'N':
		case 'O':
		case 'P':
		case 'Q':
		case 'R':
		case 'S':
		case 'T':
		case 'U':
		case 'V':
		case 'W':
		case 'X':
		case 'Y':
		case 'Z':
		case 'a':
		case 'b':
		case 'c':
		case 'd':
		case 'e':
		case 'f':
		case 'g':
		case 'h':
		case 'j':
		case 'k':
		case 'l':
		case 'm':
		case 'n':
		case 'o':
		case 'p':
		case 'q':
		case 't':
		case 'v':
		case 'w':
		case 'x':
		case 'y':
		case 'z': {
			alt4 = 12;
		}
			break;
		case '\r': {
			int LA4_12 = input.LA(2);

			if ((LA4_12 == '\n')) {
				int LA4_13 = input.LA(3);

				if (((LA4_13 >= '\t' && LA4_13 <= '\n') || LA4_13 == '\r' || LA4_13 == ' ')) {
					alt4 = 14;
				} else {
					alt4 = 13;
				}
			} else {
				alt4 = 14;
			}
		}
			break;
		case '\n': {
			int LA4_13 = input.LA(2);

			if (((LA4_13 >= '\t' && LA4_13 <= '\n') || LA4_13 == '\r' || LA4_13 == ' ')) {
				alt4 = 14;
			} else {
				alt4 = 13;
			}
		}
			break;
		case '\t':
		case ' ': {
			alt4 = 14;
		}
			break;
		default:
			NoViableAltException nvae = new NoViableAltException(
					"1:1: Tokens : ( T8 | T9 | T10 | T11 | T12 | T13 | T14 | T15 | T16 | T17 | DIGIT | ALPHA | NEWLINE | WS );",
					4, 0, input);

			throw nvae;
		}

		switch (alt4) {
		case 1:
			// ECL.g:1:10: T8
		{
			mT8();

		}
			break;
		case 2:
			// ECL.g:1:13: T9
		{
			mT9();

		}
			break;
		case 3:
			// ECL.g:1:16: T10
		{
			mT10();

		}
			break;
		case 4:
			// ECL.g:1:20: T11
		{
			mT11();

		}
			break;
		case 5:
			// ECL.g:1:24: T12
		{
			mT12();

		}
			break;
		case 6:
			// ECL.g:1:28: T13
		{
			mT13();

		}
			break;
		case 7:
			// ECL.g:1:32: T14
		{
			mT14();

		}
			break;
		case 8:
			// ECL.g:1:36: T15
		{
			mT15();

		}
			break;
		case 9:
			// ECL.g:1:40: T16
		{
			mT16();

		}
			break;
		case 10:
			// ECL.g:1:44: T17
		{
			mT17();

		}
			break;
		case 11:
			// ECL.g:1:48: DIGIT
		{
			mDIGIT();

		}
			break;
		case 12:
			// ECL.g:1:54: ALPHA
		{
			mALPHA();

		}
			break;
		case 13:
			// ECL.g:1:60: NEWLINE
		{
			mNEWLINE();

		}
			break;
		case 14:
			// ECL.g:1:68: WS
		{
			mWS();

		}
			break;

		}

	}

}