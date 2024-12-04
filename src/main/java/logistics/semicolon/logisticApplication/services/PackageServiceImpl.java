package logistics.semicolon.logisticApplication.services;


import logistics.semicolon.logisticApplication.data.models.Packagee;
import logistics.semicolon.logisticApplication.data.models.Sender;
import logistics.semicolon.logisticApplication.data.models.Receiver;
import logistics.semicolon.logisticApplication.data.models.TrackingLog;
import logistics.semicolon.logisticApplication.data.repositories.Packages;
import logistics.semicolon.logisticApplication.data.repositories.Receivers;
import logistics.semicolon.logisticApplication.data.repositories.Senders;
import logistics.semicolon.logisticApplication.data.repositories.TrackingLogs;
import logistics.semicolon.logisticApplication.dtos.packagesdtos.CreatePackagesRequest;
import logistics.semicolon.logisticApplication.dtos.packagesdtos.CreatePackagesResponse;
import logistics.semicolon.logisticApplication.dtos.senderdtos.CreateSenderRequest;
import logistics.semicolon.logisticApplication.dtos.senderdtos.CreateSenderResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PackageServiceImpl implements PackageService {
    @Autowired
    private Packages packages;
    @Autowired
    private Senders senders;
    @Autowired
    private Receivers receivers;
    @Autowired
    private List<TrackingLog> trackingLogs;

    @Override
    public CreatePackagesResponse createPackage(CreatePackagesRequest createPackagesRequest) {
        Packagee packagee = new Packagee();
        packagee.setPackageDescription(createPackagesRequest.getPackageDescription());
        packagee.setReceiver(createPackagesRequest.getReceiver());
        packagee.setDeliveryFee(createPackagesRequest.getDeliveryFee());
        packagee.setQuantity(createPackagesRequest.getQuantity());
        packagee.setCreatedAt(createPackagesRequest.getCreatedAt());
        Sender sender = new Sender();
        sender.setName(createPackagesRequest.getSendersName());
        sender.setPhoneNumber(createPackagesRequest.getSendersPhoneNumber());
        Sender savedSender = senders.save(sender);
        packagee.setSender(savedSender);
        Receiver receiver = new Receiver();
        receiver.setFullName(createPackagesRequest.getReceiversName());
        receiver.setAddress(createPackagesRequest.getReceiverAddress());
        receiver.setPhone(createPackagesRequest.getReceiversPhoneNumber());
        Receiver savedReceiver = receivers.save(receiver);
        packagee.setReceiver(savedReceiver);
        Packagee savedPackage = packages.save(packagee);
        TrackingLog trackingLog = new TrackingLog();
        trackingLog.setTrackingNumber(createPackagesRequest.getTrackingNumber());
        trackingLog.setTrackingDate(createPackagesRequest.getTrackingDate());
        trackingLogs.add(trackingLog);

        CreatePackagesResponse createPackagesResponse = new CreatePackagesResponse();
        createPackagesResponse.setPackageId(savedPackage.getPackageId());
        createPackagesResponse.setPackageDescription(savedPackage.getPackageDescription());
        createPackagesResponse.setSender(savedPackage.getSender());
        createPackagesResponse.setReceiver(savedPackage.getReceiver());
        createPackagesResponse.setTrackingLogList(savedPackage.getTrackingLogList());
        createPackagesResponse.setDeliveryFee(savedPackage.getDeliveryFee());
        createPackagesResponse.setQuantity(savedPackage.getQuantity());
        createPackagesResponse.setCreatedAt(savedPackage.getCreatedAt());
        return createPackagesResponse;
    }

    public CreateSenderResponse map(CreatePackagesRequest createPackagesRequest, CreateSenderRequest createSenderRequest) {
        Sender sender = new Sender();
        sender.setId(createPackagesRequest.getPackageId());
        sender.setName(createSenderRequest.getName());
        sender.setPhoneNumber(createSenderRequest.getPhoneNumber());

        Sender savedSender = senders.save(sender);
        CreateSenderResponse createSenderResponse = new CreateSenderResponse();
        createSenderResponse.setId(savedSender.getId());
        createSenderResponse.setName(savedSender.getName());
        createSenderResponse.setPhoneNumber(savedSender.getPhoneNumber());

        return createSenderResponse;
    }

    @Override
    public void deleteAllPackages() {
        packages.deleteAll();
    }
}
