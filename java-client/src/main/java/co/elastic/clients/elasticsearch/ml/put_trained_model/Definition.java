/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package co.elastic.clients.elasticsearch.ml.put_trained_model;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.put_trained_model.Definition
public final class Definition implements JsonpSerializable {
	@Nullable
	private final List<Preprocessor> preprocessors;

	private final TrainedModel trainedModel;

	// ---------------------------------------------------------------------------------------------

	public Definition(Builder builder) {

		this.preprocessors = builder.preprocessors;
		this.trainedModel = Objects.requireNonNull(builder.trainedModel, "trained_model");

	}

	/**
	 * Collection of preprocessors
	 * <p>
	 * API name: {@code preprocessors}
	 */
	@Nullable
	public List<Preprocessor> preprocessors() {
		return this.preprocessors;
	}

	/**
	 * The definition of the trained model.
	 * <p>
	 * API name: {@code trained_model}
	 */
	public TrainedModel trainedModel() {
		return this.trainedModel;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		if (this.preprocessors != null) {

			generator.writeKey("preprocessors");
			generator.writeStartArray();
			for (Preprocessor item0 : this.preprocessors) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

		generator.writeKey("trained_model");
		this.trainedModel.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Definition}.
	 */
	public static class Builder implements ObjectBuilder<Definition> {
		@Nullable
		private List<Preprocessor> preprocessors;

		private TrainedModel trainedModel;

		/**
		 * Collection of preprocessors
		 * <p>
		 * API name: {@code preprocessors}
		 */
		public Builder preprocessors(@Nullable List<Preprocessor> value) {
			this.preprocessors = value;
			return this;
		}

		/**
		 * Collection of preprocessors
		 * <p>
		 * API name: {@code preprocessors}
		 */
		public Builder preprocessors(Preprocessor... value) {
			this.preprocessors = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #preprocessors(List)}, creating the list if needed.
		 */
		public Builder addPreprocessors(Preprocessor value) {
			if (this.preprocessors == null) {
				this.preprocessors = new ArrayList<>();
			}
			this.preprocessors.add(value);
			return this;
		}

		/**
		 * Set {@link #preprocessors(List)} to a singleton list.
		 */
		public Builder preprocessors(Function<Preprocessor.Builder, ObjectBuilder<Preprocessor>> fn) {
			return this.preprocessors(fn.apply(new Preprocessor.Builder()).build());
		}

		/**
		 * Add a value to {@link #preprocessors(List)}, creating the list if needed.
		 */
		public Builder addPreprocessors(Function<Preprocessor.Builder, ObjectBuilder<Preprocessor>> fn) {
			return this.addPreprocessors(fn.apply(new Preprocessor.Builder()).build());
		}

		/**
		 * The definition of the trained model.
		 * <p>
		 * API name: {@code trained_model}
		 */
		public Builder trainedModel(TrainedModel value) {
			this.trainedModel = value;
			return this;
		}

		/**
		 * The definition of the trained model.
		 * <p>
		 * API name: {@code trained_model}
		 */
		public Builder trainedModel(Function<TrainedModel.Builder, ObjectBuilder<TrainedModel>> fn) {
			return this.trainedModel(fn.apply(new TrainedModel.Builder()).build());
		}

		/**
		 * Builds a {@link Definition}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Definition build() {

			return new Definition(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Definition}
	 */
	public static final JsonpDeserializer<Definition> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, Definition::setupDefinitionDeserializer);

	protected static void setupDefinitionDeserializer(DelegatingDeserializer<Definition.Builder> op) {

		op.add(Builder::preprocessors, JsonpDeserializer.arrayDeserializer(Preprocessor.DESERIALIZER), "preprocessors");
		op.add(Builder::trainedModel, TrainedModel.DESERIALIZER, "trained_model");

	}

}
