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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: cluster.stats.FieldTypesMappings
public final class FieldTypesMappings implements ToJsonp {
	private final List<FieldTypes> fieldTypes;

	@Nullable
	private final List<RuntimeFieldTypes> runtimeFieldTypes;

	// ---------------------------------------------------------------------------------------------

	protected FieldTypesMappings(Builder builder) {

		this.fieldTypes = Objects.requireNonNull(builder.fieldTypes, "field_types");
		this.runtimeFieldTypes = builder.runtimeFieldTypes;

	}

	/**
	 * API name: {@code field_types}
	 */
	public List<FieldTypes> fieldTypes() {
		return this.fieldTypes;
	}

	/**
	 * API name: {@code runtime_field_types}
	 */
	@Nullable
	public List<RuntimeFieldTypes> runtimeFieldTypes() {
		return this.runtimeFieldTypes;
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

		generator.writeKey("field_types");
		generator.writeStartArray();
		for (FieldTypes item0 : this.fieldTypes) {
			item0.toJsonp(generator, mapper);

		}
		generator.writeEnd();

		if (this.runtimeFieldTypes != null) {

			generator.writeKey("runtime_field_types");
			generator.writeStartArray();
			for (RuntimeFieldTypes item0 : this.runtimeFieldTypes) {
				item0.toJsonp(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link FieldTypesMappings}.
	 */
	public static class Builder implements ObjectBuilder<FieldTypesMappings> {
		private List<FieldTypes> fieldTypes;

		@Nullable
		private List<RuntimeFieldTypes> runtimeFieldTypes;

		/**
		 * API name: {@code field_types}
		 */
		public Builder fieldTypes(List<FieldTypes> value) {
			this.fieldTypes = value;
			return this;
		}

		/**
		 * API name: {@code field_types}
		 */
		public Builder fieldTypes(FieldTypes... value) {
			this.fieldTypes = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #fieldTypes(List)}, creating the list if needed.
		 */
		public Builder addFieldTypes(FieldTypes value) {
			if (this.fieldTypes == null) {
				this.fieldTypes = new ArrayList<>();
			}
			this.fieldTypes.add(value);
			return this;
		}

		/**
		 * Set {@link #fieldTypes(List)} to a singleton list.
		 */
		public Builder fieldTypes(Function<FieldTypes.Builder, ObjectBuilder<FieldTypes>> fn) {
			return this.fieldTypes(fn.apply(new FieldTypes.Builder()).build());
		}

		/**
		 * Add a value to {@link #fieldTypes(List)}, creating the list if needed.
		 */
		public Builder addFieldTypes(Function<FieldTypes.Builder, ObjectBuilder<FieldTypes>> fn) {
			return this.addFieldTypes(fn.apply(new FieldTypes.Builder()).build());
		}

		/**
		 * API name: {@code runtime_field_types}
		 */
		public Builder runtimeFieldTypes(@Nullable List<RuntimeFieldTypes> value) {
			this.runtimeFieldTypes = value;
			return this;
		}

		/**
		 * API name: {@code runtime_field_types}
		 */
		public Builder runtimeFieldTypes(RuntimeFieldTypes... value) {
			this.runtimeFieldTypes = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #runtimeFieldTypes(List)}, creating the list if needed.
		 */
		public Builder addRuntimeFieldTypes(RuntimeFieldTypes value) {
			if (this.runtimeFieldTypes == null) {
				this.runtimeFieldTypes = new ArrayList<>();
			}
			this.runtimeFieldTypes.add(value);
			return this;
		}

		/**
		 * Set {@link #runtimeFieldTypes(List)} to a singleton list.
		 */
		public Builder runtimeFieldTypes(Function<RuntimeFieldTypes.Builder, ObjectBuilder<RuntimeFieldTypes>> fn) {
			return this.runtimeFieldTypes(fn.apply(new RuntimeFieldTypes.Builder()).build());
		}

		/**
		 * Add a value to {@link #runtimeFieldTypes(List)}, creating the list if needed.
		 */
		public Builder addRuntimeFieldTypes(Function<RuntimeFieldTypes.Builder, ObjectBuilder<RuntimeFieldTypes>> fn) {
			return this.addRuntimeFieldTypes(fn.apply(new RuntimeFieldTypes.Builder()).build());
		}

		/**
		 * Builds a {@link FieldTypesMappings}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public FieldTypesMappings build() {

			return new FieldTypesMappings(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for FieldTypesMappings
	 */
	public static final JsonpDeserializer<FieldTypesMappings> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, FieldTypesMappings::setupFieldTypesMappingsDeserializer);

	protected static void setupFieldTypesMappingsDeserializer(DelegatingDeserializer<FieldTypesMappings.Builder> op) {

		op.add(Builder::fieldTypes, JsonpDeserializer.arrayDeserializer(FieldTypes.DESERIALIZER), "field_types");
		op.add(Builder::runtimeFieldTypes, JsonpDeserializer.arrayDeserializer(RuntimeFieldTypes.DESERIALIZER),
				"runtime_field_types");

	}

}
