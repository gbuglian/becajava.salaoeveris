package br.salaoEveris.app.controller;

import br.salaoEveris.app.response.BaseResponse;

public class BaseController {
	 public BaseResponse errorBase = new BaseResponse();
	 
	    public BaseController() {
	        errorBase.StatusCode = 500;
	        errorBase.message = "Erro inesperado";
	    }
}
