package com.avanttic.appadf.model.bc.services.view.JobHistory3VO;

import com.avanttic.appadf.model.bc.services.applicationModule.AppModuleAMFixture;

import oracle.jbo.ViewObject;

import org.junit.*;
import static org.junit.Assert.*;

public class JobHistory3VOTest {
    private AppModuleAMFixture fixture1 = AppModuleAMFixture.getInstance();

    public JobHistory3VOTest() {
    }

    @Test
    public void testAccess() {
        ViewObject view = fixture1.getApplicationModule().findViewObject("JobHistory3");
        assertNotNull(view);
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }
}
