package com.co.arturocalle.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/",
        tags = "@AgregarProducto",
        glue = "com.co.arturocalle.stepDefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE

)
public class AgregarProductoRunner {
}
