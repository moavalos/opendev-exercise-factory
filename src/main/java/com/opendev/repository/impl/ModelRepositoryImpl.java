package com.opendev.repository.impl;

import java.util.HashMap;
import java.util.Map;

import com.opendev.entity.Model;
import com.opendev.repository.ModelRepository;

public class ModelRepositoryImpl implements ModelRepository {

	@Override
	public Model getOne(Integer idModel) {
		return dbModels.get(idModel);
	}

	static volatile protected transient Map<Integer, Model> dbModels = new HashMap<>() {{
		put(1, new Model(1, "Sedán", 230000.0));
		put(2, new Model(2, "Familiar", 245000.0));
		put(3, new Model(3, "Coupé", 270000.0));
	}};
}
