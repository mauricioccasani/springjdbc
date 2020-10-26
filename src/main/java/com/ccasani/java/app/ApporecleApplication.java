package com.ccasani.java.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@ComponentScan("com.ccasani.java.app.dao")
//implements CommandLineRunner
public class ApporecleApplication  {
//	@Autowired
//	private ProveedorDao dao;

	public static void main(String[] args) {
		SpringApplication.run(ApporecleApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//		List<ProveedorDto> listar=this.dao.proveedores();
//		for (ProveedorDto proveedorDto : listar) {
//			System.out.println(proveedorDto);
//		}
//	}

}
