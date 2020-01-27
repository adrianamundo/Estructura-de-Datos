package com.examplequeue.Queue;

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
		int y = 1;
		return y;
	}

	@RequestMapping("/deque")
	public String tester2(){
		test.dequeue();
		String dqued = "Eliminado.";
		return dqued;
	}


	public static void main(String[] args) {
		Operaciones test = new Operaciones(100);
		test.enqueue(10);


		SpringApplication.run(QueueApplication.class, args);
	}

}
