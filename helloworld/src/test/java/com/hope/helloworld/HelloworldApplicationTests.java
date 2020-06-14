package com.hope.helloworld;

import com.hope.helloworld.controller.HelloworldController;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ContextConfiguration
@RunWith(SpringRunner.class)
@SpringBootTest
class HelloworldApplicationTests {

	private MockMvc mockMvc;
	@BeforeEach
	public void setMockMvc(){
		System.out.println("获取mockMvc");
		mockMvc = MockMvcBuilders.standaloneSetup(new HelloworldController()).build();
	}

	@Test
	public void hellTest() throws Exception {
		MvcResult hello_world = mockMvc.perform(MockMvcRequestBuilders.get("/hello").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andReturn();
		System.out.println(hello_world.getResponse().getContentAsString());
	}

}
