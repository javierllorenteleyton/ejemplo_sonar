package com.avanttic.appadf.model.bc.services;

import com.avanttic.appadf.model.bc.services.applicationModule.AppModuleAMFixture;
import com.avanttic.appadf.model.bc.services.view.Countries1VO.Countries1VOTest;
import com.avanttic.appadf.model.bc.services.view.Countries2VO.Countries2VOTest;
import com.avanttic.appadf.model.bc.services.view.Departments1VO.Departments1VOTest;
import com.avanttic.appadf.model.bc.services.view.Departments2VO.Departments2VOTest;
import com.avanttic.appadf.model.bc.services.view.Departments3VO.Departments3VOTest;
import com.avanttic.appadf.model.bc.services.view.Employees1VO.Employees1VOTest;
import com.avanttic.appadf.model.bc.services.view.Employees2VO.Employees2VOTest;
import com.avanttic.appadf.model.bc.services.view.Employees3VO.Employees3VOTest;
import com.avanttic.appadf.model.bc.services.view.Employees4VO.Employees4VOTest;
import com.avanttic.appadf.model.bc.services.view.JobHistory1VO.JobHistory1VOTest;
import com.avanttic.appadf.model.bc.services.view.JobHistory2VO.JobHistory2VOTest;
import com.avanttic.appadf.model.bc.services.view.JobHistory3VO.JobHistory3VOTest;
import com.avanttic.appadf.model.bc.services.view.JobHistory4VO.JobHistory4VOTest;
import com.avanttic.appadf.model.bc.services.view.Jobs1VO.Jobs1VOTest;
import com.avanttic.appadf.model.bc.services.view.Locations1VO.Locations1VOTest;
import com.avanttic.appadf.model.bc.services.view.Locations2VO.Locations2VOTest;
import com.avanttic.appadf.model.bc.services.view.Regions1VO.Regions1VOTest;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses( { Countries2VOTest.class, Locations2VOTest.class, JobHistory4VOTest.class, JobHistory3VOTest.class, JobHistory2VOTest.class, Departments3VOTest.class, Departments2VOTest.class,
                       Employees4VOTest.class, Employees3VOTest.class, Employees2VOTest.class, Regions1VOTest.class, Locations1VOTest.class, Jobs1VOTest.class, JobHistory1VOTest.class,
                       Employees1VOTest.class, Departments1VOTest.class, Countries1VOTest.class })
public class AllAppModuleAMTests {
    @BeforeClass
    public static void setUp() {
    }

    @AfterClass
    public static void tearDown() throws Exception {
        AppModuleAMFixture.getInstance().release();
    }
}
