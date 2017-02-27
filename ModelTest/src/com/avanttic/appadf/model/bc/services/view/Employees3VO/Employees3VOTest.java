package com.avanttic.appadf.model.bc.services.view.Employees3VO;

import com.avanttic.appadf.model.bc.services.applicationModule.AppModuleAMFixture;

import oracle.jbo.ViewObject;

import org.junit.*;
import static org.junit.Assert.*;

public class Employees3VOTest {
    private AppModuleAMFixture fixture1 = AppModuleAMFixture.getInstance();

    public Employees3VOTest() {
    }

    @Test
    public void testAccess() {
        ViewObject view = fixture1.getApplicationModule().findViewObject("Employees3");
        assertNotNull(view);
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }
}
