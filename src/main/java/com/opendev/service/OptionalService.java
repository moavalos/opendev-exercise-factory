package com.opendev.service;

import java.util.Set;

import com.opendev.entity.Optional;

public interface OptionalService {

	Double sumCost(Set<Optional> optionals);

	Set<Optional> getByIds(Set<Integer> idsOptionals);

}
