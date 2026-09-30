package ie.atu.cicd1.catalog.cicd1orderservice1.service;

import ie.atu.cicd1.catalog.cicd1orderservice1.model.PurchaseOrder;
import ie.atu.cicd1.catalog.cicd1orderservice1.repository.PurchaseOrderRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PurchaseOrderService {

    private final PurchaseOrderRepository repository;

    public PurchaseOrderService(PurchaseOrderRepository repository) {
        this.repository = repository;
    }

    public List<PurchaseOrder> getAll() {
        return repository.findAll();
    }

    public PurchaseOrder create(PurchaseOrder order) {
        order.setId(null);
        return repository.save(order);

    }
}
