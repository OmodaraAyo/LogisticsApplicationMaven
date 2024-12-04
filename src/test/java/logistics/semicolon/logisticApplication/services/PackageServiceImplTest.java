package logistics.semicolon.logisticApplication.services;


import logistics.semicolon.logisticApplication.data.repositories.Packages;
import logistics.semicolon.logisticApplication.dtos.packagesdtos.CreatePackagesRequest;
import logistics.semicolon.logisticApplication.dtos.packagesdtos.CreatePackagesResponse;
import logistics.semicolon.logisticApplication.dtos.senderdtos.CreateSenderRequest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class PackageServiceImplTest {
    @Autowired
    private PackageService packageService;
    @Autowired
    private Packages packages;

    @BeforeEach
    public void startAllWithThis(){
        packageService.deleteAllPackages();
    }
    @Test
    public void testToAddPackage() {
        CreatePackagesRequest createPackagesRequest = new CreatePackagesRequest();
        CreatePackagesResponse output = packageService.createPackage(createPackagesRequest);
        assertEquals(1L, packages.count());
        System.out.println(output.toString());
    }

}