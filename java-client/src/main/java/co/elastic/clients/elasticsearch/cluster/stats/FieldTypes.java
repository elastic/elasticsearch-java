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

package co.elastic.clients.elasticsearch.cluster.stats;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: cluster.stats.FieldTypes
public final class FieldTypes implements ToJsonp {
	private final String name;

	private final Number count;

	private final Number indexCount;

	@Nullable
	private final Number scriptCount;

	// ---------------------------------------------------------------------------------------------

	protected FieldTypes(Builder builder) {

		this.name = Objects.requireNonNull(builder.name, "name");
		this.count = Objects.requireNonNull(builder.count, "count");
		this.indexCount = Objects.requireNonNull(builder.indexCount, "index_count");
		this.scriptCount = builder.scriptCount;

	}

	/**
	 * API name: {@code name}
	 */
	public String name() {
		return this.name;
	}

	/**
	 * API name: {@code count}
	 */
	public Number count() {
		return this.count;
	}

	/**
	 * API name: {@code index_count}
	 */
	public Number indexCount() {
		return this.indexCount;
	}

	/**
	 * API name: {@code script_count}
	 */
	@Nullable
	public Number scriptCount() {
		return this.scriptCount;
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

		generator.writeKey("name");
		generator.write(this.name);

		generator.writeKey("count");
		generator.write(this.count.doubleValue());

		generator.writeKey("index_count");
		generator.write(this.indexCount.doubleValue());

		if (this.scriptCount != null) {

			generator.writeKey("script_count");
			generator.write(this.scriptCount.doubleValue());

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link FieldTypes}.
	 */
	public static class Builder implements ObjectBuilder<FieldTypes> {
		private String name;

		private Number count;

		private Number indexCount;

		@Nullable
		private Number scriptCount;

		/**
		 * API name: {@code name}
		 */
		public Builder name(String value) {
			this.name = value;
			return this;
		}

		/**
		 * API name: {@code count}
		 */
		public Builder count(Number value) {
			this.count = value;
			return this;
		}

		/**
		 * API name: {@code index_count}
		 */
		public Builder indexCount(Number value) {
			this.indexCount = value;
			return this;
		}

		/**
		 * API name: {@code script_count}
		 */
		public Builder scriptCount(@Nullable Number value) {
			this.scriptCount = value;
			return this;
		}

		/**
		 * Builds a {@link FieldTypes}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public FieldTypes build() {

			return new FieldTypes(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for FieldTypes
	 */
	public static final JsonpDeserializer<FieldTypes> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, FieldTypes::setupFieldTypesDeserializer);

	protected static void setupFieldTypesDeserializer(DelegatingDeserializer<FieldTypes.Builder> op) {

		op.add(Builder::name, JsonpDeserializer.stringDeserializer(), "name");
		op.add(Builder::count, JsonpDeserializer.numberDeserializer(), "count");
		op.add(Builder::indexCount, JsonpDeserializer.numberDeserializer(), "index_count");
		op.add(Builder::scriptCount, JsonpDeserializer.numberDeserializer(), "script_count");

	}

}
