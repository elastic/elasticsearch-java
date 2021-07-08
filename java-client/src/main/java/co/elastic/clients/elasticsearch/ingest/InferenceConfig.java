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

package co.elastic.clients.elasticsearch.ingest;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ingest._types.InferenceConfig
public final class InferenceConfig implements ToJsonp {
	@Nullable
	private final InferenceConfigRegression regression;

	// ---------------------------------------------------------------------------------------------

	protected InferenceConfig(Builder builder) {

		this.regression = builder.regression;

	}

	/**
	 * API name: {@code regression}
	 */
	@Nullable
	public InferenceConfigRegression regression() {
		return this.regression;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		toJsonpInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {

		if (this.regression != null) {

			generator.writeKey("regression");
			this.regression.toJsonp(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link InferenceConfig}.
	 */
	public static class Builder implements ObjectBuilder<InferenceConfig> {
		@Nullable
		private InferenceConfigRegression regression;

		/**
		 * API name: {@code regression}
		 */
		public Builder regression(@Nullable InferenceConfigRegression value) {
			this.regression = value;
			return this;
		}

		/**
		 * API name: {@code regression}
		 */
		public Builder regression(
				Function<InferenceConfigRegression.Builder, ObjectBuilder<InferenceConfigRegression>> fn) {
			return this.regression(fn.apply(new InferenceConfigRegression.Builder()).build());
		}

		/**
		 * Builds a {@link InferenceConfig}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public InferenceConfig build() {

			return new InferenceConfig(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for InferenceConfig
	 */
	public static final JsonpDeserializer<InferenceConfig> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, InferenceConfig::setupInferenceConfigDeserializer);

	protected static void setupInferenceConfigDeserializer(DelegatingDeserializer<InferenceConfig.Builder> op) {

		op.add(Builder::regression, InferenceConfigRegression.DESERIALIZER, "regression");

	}

}
