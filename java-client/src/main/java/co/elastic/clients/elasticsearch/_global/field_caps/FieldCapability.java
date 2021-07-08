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

package co.elastic.clients.elasticsearch._global.field_caps;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: _global.field_caps.FieldCapability
public final class FieldCapability implements ToJsonp {
	private final Boolean aggregatable;

	@Nullable
	private final List<String> indices;

	@Nullable
	private final Map<String, List<String>> meta;

	@Nullable
	private final List<String> nonAggregatableIndices;

	@Nullable
	private final List<String> nonSearchableIndices;

	private final Boolean searchable;

	private final String type;

	// ---------------------------------------------------------------------------------------------

	protected FieldCapability(Builder builder) {

		this.aggregatable = Objects.requireNonNull(builder.aggregatable, "aggregatable");
		this.indices = builder.indices;
		this.meta = builder.meta;
		this.nonAggregatableIndices = builder.nonAggregatableIndices;
		this.nonSearchableIndices = builder.nonSearchableIndices;
		this.searchable = Objects.requireNonNull(builder.searchable, "searchable");
		this.type = Objects.requireNonNull(builder.type, "type");

	}

	/**
	 * API name: {@code aggregatable}
	 */
	public Boolean aggregatable() {
		return this.aggregatable;
	}

	/**
	 * API name: {@code indices}
	 */
	@Nullable
	public List<String> indices() {
		return this.indices;
	}

	/**
	 * API name: {@code meta}
	 */
	@Nullable
	public Map<String, List<String>> meta() {
		return this.meta;
	}

	/**
	 * API name: {@code non_aggregatable_indices}
	 */
	@Nullable
	public List<String> nonAggregatableIndices() {
		return this.nonAggregatableIndices;
	}

	/**
	 * API name: {@code non_searchable_indices}
	 */
	@Nullable
	public List<String> nonSearchableIndices() {
		return this.nonSearchableIndices;
	}

	/**
	 * API name: {@code searchable}
	 */
	public Boolean searchable() {
		return this.searchable;
	}

	/**
	 * API name: {@code type}
	 */
	public String type() {
		return this.type;
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

		generator.writeKey("aggregatable");
		generator.write(this.aggregatable);

		if (this.indices != null) {

			generator.writeKey("indices");
			generator.writeStartArray();
			for (String item0 : this.indices) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.meta != null) {

			generator.writeKey("meta");
			generator.writeStartObject();
			for (Map.Entry<String, List<String>> item0 : this.meta.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.writeStartArray();
				for (String item1 : item0.getValue()) {
					generator.write(item1);

				}
				generator.writeEnd();

			}
			generator.writeEnd();

		}
		if (this.nonAggregatableIndices != null) {

			generator.writeKey("non_aggregatable_indices");
			generator.writeStartArray();
			for (String item0 : this.nonAggregatableIndices) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.nonSearchableIndices != null) {

			generator.writeKey("non_searchable_indices");
			generator.writeStartArray();
			for (String item0 : this.nonSearchableIndices) {
				generator.write(item0);

			}
			generator.writeEnd();

		}

		generator.writeKey("searchable");
		generator.write(this.searchable);

		generator.writeKey("type");
		generator.write(this.type);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link FieldCapability}.
	 */
	public static class Builder implements ObjectBuilder<FieldCapability> {
		private Boolean aggregatable;

		@Nullable
		private List<String> indices;

		@Nullable
		private Map<String, List<String>> meta;

		@Nullable
		private List<String> nonAggregatableIndices;

		@Nullable
		private List<String> nonSearchableIndices;

		private Boolean searchable;

		private String type;

		/**
		 * API name: {@code aggregatable}
		 */
		public Builder aggregatable(Boolean value) {
			this.aggregatable = value;
			return this;
		}

		/**
		 * API name: {@code indices}
		 */
		public Builder indices(@Nullable List<String> value) {
			this.indices = value;
			return this;
		}

		/**
		 * API name: {@code indices}
		 */
		public Builder indices(String... value) {
			this.indices = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #indices(List)}, creating the list if needed.
		 */
		public Builder addIndices(String value) {
			if (this.indices == null) {
				this.indices = new ArrayList<>();
			}
			this.indices.add(value);
			return this;
		}

		/**
		 * API name: {@code meta}
		 */
		public Builder meta(@Nullable Map<String, List<String>> value) {
			this.meta = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #meta(Map)}, creating the map if needed.
		 */
		public Builder putMeta(String key, List<String> value) {
			if (this.meta == null) {
				this.meta = new HashMap<>();
			}
			this.meta.put(key, value);
			return this;
		}

		/**
		 * API name: {@code non_aggregatable_indices}
		 */
		public Builder nonAggregatableIndices(@Nullable List<String> value) {
			this.nonAggregatableIndices = value;
			return this;
		}

		/**
		 * API name: {@code non_aggregatable_indices}
		 */
		public Builder nonAggregatableIndices(String... value) {
			this.nonAggregatableIndices = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #nonAggregatableIndices(List)}, creating the list if
		 * needed.
		 */
		public Builder addNonAggregatableIndices(String value) {
			if (this.nonAggregatableIndices == null) {
				this.nonAggregatableIndices = new ArrayList<>();
			}
			this.nonAggregatableIndices.add(value);
			return this;
		}

		/**
		 * API name: {@code non_searchable_indices}
		 */
		public Builder nonSearchableIndices(@Nullable List<String> value) {
			this.nonSearchableIndices = value;
			return this;
		}

		/**
		 * API name: {@code non_searchable_indices}
		 */
		public Builder nonSearchableIndices(String... value) {
			this.nonSearchableIndices = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #nonSearchableIndices(List)}, creating the list if
		 * needed.
		 */
		public Builder addNonSearchableIndices(String value) {
			if (this.nonSearchableIndices == null) {
				this.nonSearchableIndices = new ArrayList<>();
			}
			this.nonSearchableIndices.add(value);
			return this;
		}

		/**
		 * API name: {@code searchable}
		 */
		public Builder searchable(Boolean value) {
			this.searchable = value;
			return this;
		}

		/**
		 * API name: {@code type}
		 */
		public Builder type(String value) {
			this.type = value;
			return this;
		}

		/**
		 * Builds a {@link FieldCapability}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public FieldCapability build() {

			return new FieldCapability(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for FieldCapability
	 */
	public static final JsonpDeserializer<FieldCapability> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, FieldCapability::setupFieldCapabilityDeserializer);

	protected static void setupFieldCapabilityDeserializer(DelegatingDeserializer<FieldCapability.Builder> op) {

		op.add(Builder::aggregatable, JsonpDeserializer.booleanDeserializer(), "aggregatable");
		op.add(Builder::indices, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"indices");
		op.add(Builder::meta, JsonpDeserializer.stringMapDeserializer(
				JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer())), "meta");
		op.add(Builder::nonAggregatableIndices,
				JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"non_aggregatable_indices");
		op.add(Builder::nonSearchableIndices,
				JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "non_searchable_indices");
		op.add(Builder::searchable, JsonpDeserializer.booleanDeserializer(), "searchable");
		op.add(Builder::type, JsonpDeserializer.stringDeserializer(), "type");

	}

}
