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

package co.elastic.clients.elasticsearch._global.search;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: _global.search._types.LaplaceSmoothingModel
public final class LaplaceSmoothingModel implements ToJsonp {
	private final Number alpha;

	// ---------------------------------------------------------------------------------------------

	protected LaplaceSmoothingModel(Builder builder) {

		this.alpha = Objects.requireNonNull(builder.alpha, "alpha");

	}

	/**
	 * API name: {@code alpha}
	 */
	public Number alpha() {
		return this.alpha;
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

		generator.writeKey("alpha");
		generator.write(this.alpha.doubleValue());

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link LaplaceSmoothingModel}.
	 */
	public static class Builder implements ObjectBuilder<LaplaceSmoothingModel> {
		private Number alpha;

		/**
		 * API name: {@code alpha}
		 */
		public Builder alpha(Number value) {
			this.alpha = value;
			return this;
		}

		/**
		 * Builds a {@link LaplaceSmoothingModel}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public LaplaceSmoothingModel build() {

			return new LaplaceSmoothingModel(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for LaplaceSmoothingModel
	 */
	public static final JsonpDeserializer<LaplaceSmoothingModel> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, LaplaceSmoothingModel::setupLaplaceSmoothingModelDeserializer);

	protected static void setupLaplaceSmoothingModelDeserializer(
			DelegatingDeserializer<LaplaceSmoothingModel.Builder> op) {

		op.add(Builder::alpha, JsonpDeserializer.numberDeserializer(), "alpha");

	}

}
