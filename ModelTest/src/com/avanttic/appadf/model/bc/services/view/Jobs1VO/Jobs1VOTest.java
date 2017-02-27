package com.avanttic.appadf.model.bc.services.view.Jobs1VO;

import com.avanttic.appadf.model.bc.services.applicationModule.AppModuleAMFixture;

import oracle.jbo.ViewObject;

import org.junit.*;
import static org.junit.Assert.*;

public class Jobs1VOTest {
    private AppModuleAMFixture fixture1 = AppModuleAMFixture.getInstance();

    public Jobs1VOTest() {
    }

    @Test
    public void testAccess() {
        ViewObject view = fixture1.getApplicationModule().findViewObject("Jobs1");
        assertNotNull(view);
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }
}
