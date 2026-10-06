package ie.atu.cicd1.catalog.cicd1orderservice1.service;

import ie.atu.cicd1.catalog.cicd1orderservice1.model.PurchaseOrder;
import ie.atu.cicd1.catalog.cicd1orderservice1.repository.PurchaseOrderRepository;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;
import ie.atu.cicd1.catalog.cicd1orderservice1.client.CatalogClient;

import java.util.ArrayList;
import java.util.List;

@Service
public class PurchaseOrderService {

    private final PurchaseOrderRepository repository;
    private final CatalogClient catalogClient;
    public PurchaseOrderService(PurchaseOrderRepository repository, CatalogClient catalogClient) {
        this.repository = repository;
        this.catalogClient = catalogClient;
    }

    public List<PurchaseOrder> getAll() {
        return repository.findAll();
    }

    public PurchaseOrder create(PurchaseOrder order) {
        order.setId(null);
        return repository.save(order);

    }


}
