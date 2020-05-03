package com.syntax.intro;

public class SChromeDriver  implements SWebDriver {
	
	
	SChromeDriver(){
		System.err.println("Opent Chrom Browser::");
	}

	@Override
	public void get(String url) {
		System.out.println("Lunsh the Url::"+url);
		
	}

	@Override
	public void gerCurrentUrl() {
		System.out.println("Open the Browser ");
		
	}

	@Override
	public void close() {
		System.out.println("Close the Url::");
		
	}

	@Override
	public void getTiltel() {
		// TODO Auto-generated method stub
		
	}

}
