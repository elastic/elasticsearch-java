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

package co.elastic.clients.elasticsearch._types.query_dsl;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import javax.annotation.Nullable;

// typedef: _types.query_dsl.GeoBoundingBoxQuery
public final class GeoBoundingBoxQuery extends QueryBase {
	@Nullable
	private final JsonValue type;

	@Nullable
	private final JsonValue validationMethod;

	// ---------------------------------------------------------------------------------------------

	protected GeoBoundingBoxQuery(Builder builder) {
		super(builder);
		this.type = builder.type;
		this.validationMethod = builder.validationMethod;

	}

	/**
	 * API name: {@code type}
	 */
	@Nullable
	public JsonValue type() {
		return this.type;
	}

	/**
	 * API name: {@code validation_method}
	 */
	@Nullable
	public JsonValue validationMethod() {
		return this.validationMethod;
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {
		super.toJsonpInternal(generator, mapper);
		if (this.type != null) {

			generator.writeKey("type");
			generator.write(this.type);

		}
		if (this.validationMethod != null) {

			generator.writeKey("validation_method");
			generator.write(this.validationMethod);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GeoBoundingBoxQuery}.
	 */
	public static class Builder extends QueryBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<GeoBoundingBoxQuery> {
		@Nullable
		private JsonValue type;

		@Nullable
		private JsonValue validationMethod;

		/**
		 * API name: {@code type}
		 */
		public Builder type(@Nullable JsonValue value) {
			this.type = value;
			return this;
		}

		/**
		 * API name: {@code validation_method}
		 */
		public Builder validationMethod(@Nullable JsonValue value) {
			this.validationMethod = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GeoBoundingBoxQuery}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GeoBoundingBoxQuery build() {

			return new GeoBoundingBoxQuery(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for GeoBoundingBoxQuery
	 */
	public static final JsonpDeserializer<GeoBoundingBoxQuery> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, GeoBoundingBoxQuery::setupGeoBoundingBoxQueryDeserializer);

	protected static void setupGeoBoundingBoxQueryDeserializer(DelegatingDeserializer<GeoBoundingBoxQuery.Builder> op) {
		QueryBase.setupQueryBaseDeserializer(op);
		op.add(Builder::type, JsonpDeserializer.jsonValueDeserializer(), "type");
		op.add(Builder::validationMethod, JsonpDeserializer.jsonValueDeserializer(), "validation_method");

	}

}
