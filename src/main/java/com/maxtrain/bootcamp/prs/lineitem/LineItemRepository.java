package com.maxtrain.bootcamp.prs.lineitem;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LineItemRepository extends JpaRepository<LineItem, Integer>{

	Iterable<LineItem> getLineItemByRequestId(Integer requestId);
	Optional<LineItem> getLineItemsByRequestId(Integer requestId);
	
}
