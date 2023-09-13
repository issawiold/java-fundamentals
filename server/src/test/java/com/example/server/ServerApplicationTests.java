package com.example.server;

import com.example.server.Repositories.UserModelRepository;
import com.example.server.models.UserModel;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.hasValue;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
class ServerApplicationTests {
	@Autowired
	private MockMvc mockMvc;
    @Autowired
	private UserModelRepository userModelRepository;

	@Test
	void websiteStatusTest() throws Exception {
		mockMvc.perform(post("/signup")
				.contentType(MediaType.APPLICATION_FORM_URLENCODED)
				.param("username", "hello")
				.param("password", "hello123")

				)
				.andExpect(status().is3xxRedirection())
				.andExpect(redirectedUrl("/login"))
				.andExpect(view().name("login.html"));

	}
	@Test
	void websiteResponseTest() throws Exception{
		UserModel user=new UserModel("hello1","hello2");
		userModelRepository.save(user);
		mockMvc.perform(get("/login")
				.param("username", "hello1")
				.param("password", "hello2"))
				.andExpect(status().is3xxRedirection())
				.andExpect(redirectedUrl("/mainpage"))
				.andExpect(view().name("mainpage.html"))
				.andExpect(model().attribute("username", hasValue("hello1")));





	}

}
