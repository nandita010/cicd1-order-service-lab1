package ie.atu.cicd1.catalog.cicd1orderservice1.service;

import ie.atu.cicd1.catalog.cicd1orderservice1.model.PurchaseOrder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PurchaseOrderService {
    private final List<PurchaseOrder> orders = new ArrayList<>();
    private long nextId = 1;

    public List<PurchaseOrder> getAll() {
        return orders;
    }

    public PurchaseOrder create (PurchaseOrder order) {
        orders.add(order);
        order.setId(nextId++);
        return order;
    }
}
