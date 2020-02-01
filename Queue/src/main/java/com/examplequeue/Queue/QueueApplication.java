package com.examplequeue.Queue;
import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class QueueApplication {
	public Operaciones test = new Operaciones(100);
	@RequestMapping("/enqueue")
	public int tester(int x){
		test.enqueue(x);
		int y = 10;
		return y;

	}

	@RequestMapping("/dequeue")
	public int tester2(){
		test.dequeue();
		int b=12;
		return b;


	}

	@RequestMapping("/show")
	public String show(){
		test.show();
		String tester3 = Arrays.toString(test.array);
		return tester3;
	}


	public static void main(String[] args) {
		Operaciones test = new Operaciones(100);
		test.enqueue(10 );



		SpringApplication.run(QueueApplication.class, args);
	}

}
