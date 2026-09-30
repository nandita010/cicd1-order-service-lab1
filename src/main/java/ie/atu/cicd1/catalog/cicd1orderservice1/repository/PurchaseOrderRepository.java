package ie.atu.cicd1.catalog.cicd1orderservice1.repository;

import ie.atu.cicd1.catalog.cicd1orderservice1.model.PurchaseOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PurchaseOrderRepository extends JpaRepository<PurchaseOrder,Long> {
}
