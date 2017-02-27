package com.avanttic.appadf.model.bc.services.view.Countries2VO;

import com.avanttic.appadf.model.bc.services.applicationModule.AppModuleAMFixture;

import oracle.jbo.ViewObject;

import org.junit.*;
import static org.junit.Assert.*;

public class Countries2VOTest {
    private AppModuleAMFixture fixture1 = AppModuleAMFixture.getInstance();

    public Countries2VOTest() {
    }

    @Test
    public void testAccess() {
        ViewObject view = fixture1.getApplicationModule().findViewObject("Countries2");
        assertNotNull(view);
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }
}
