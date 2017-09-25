package com.supwisdom.mappers;

import com.supwisdom.MybatisTestConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

@SpringBootTest(classes = MybatisTestConfiguration.class)
public class CityMapperIT extends AbstractTestNGSpringContextTests {

  @Autowired
  private CityMapper cityMapper;

  @Test
  public void testFindByState() throws Exception {

    assertEquals(cityMapper.findByState("NY").size(), 1);

  }

}
