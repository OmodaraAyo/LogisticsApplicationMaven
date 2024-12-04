package logistics.semicolon.logisticApplication.services;

import logistics.semicolon.logisticApplication.dtos.packagesdtos.CreatePackagesRequest;
import logistics.semicolon.logisticApplication.dtos.packagesdtos.CreatePackagesResponse;

public interface PackageService {
    CreatePackagesResponse createPackage(CreatePackagesRequest createPackagesRequest);
    void deleteAllPackages();
}
