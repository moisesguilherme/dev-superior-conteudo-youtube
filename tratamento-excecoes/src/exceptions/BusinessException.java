package exceptions;

//Exception e RuntimeException
//Exception é obrigado a tratar uma excecao e runtimeexception é opcional
public class BusinessException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public BusinessException(String msg) {
		super(msg);
	}
}
