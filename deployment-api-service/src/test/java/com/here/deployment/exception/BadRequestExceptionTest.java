package com.here.deployment.exception;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.assertThat;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import com.here.deployment.exception.BadRequestException;
import com.here.deployment.exception.DeploymentApiException;

@RunWith(JUnit4.class)
public class BadRequestExceptionTest {

	@Test
	public void test_default_constructor() {
		BadRequestException exception = new BadRequestException();
		assertThat(exception, not(nullValue()));
		assertThat(exception, instanceOf(DeploymentApiException.class));
	}
	
	@Test
	public void test_string_constructor() {
		BadRequestException exception = new BadRequestException("error!");
		assertThat(exception, not(nullValue()));
		assertThat(exception, instanceOf(DeploymentApiException.class));
		assertThat(exception.getMessage(), equalTo("error!"));
	}
}
