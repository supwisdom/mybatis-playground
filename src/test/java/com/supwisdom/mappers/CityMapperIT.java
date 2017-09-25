package com.supwisdom.mappers;

import com.supwisdom.MybatisTestConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

@SpringBootTest(classes = MybatisTestConfiguration.class)
public class CityMapperIT extends AbstractTestNGSpringContextTests {

  @Autowired
  private CityMapper cityMapper;

  @Test
  public void testFindByState() throws Exception {

    cityMapper.findByState("NY");
  }

}
