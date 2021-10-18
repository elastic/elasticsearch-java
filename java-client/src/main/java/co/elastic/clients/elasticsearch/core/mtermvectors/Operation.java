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

package co.elastic.clients.elasticsearch.core.mtermvectors;

import co.elastic.clients.elasticsearch._types.VersionType;
import co.elastic.clients.elasticsearch.core.termvectors.Filter;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.mtermvectors.Operation
@JsonpDeserializable
public final class Operation implements JsonpSerializable {
	private final JsonData doc;

	private final List<String> fields;

	private final boolean fieldStatistics;

	private final Filter filter;

	private final String id;

	private final String index;

	private final boolean offsets;

	private final boolean payloads;

	private final boolean positions;

	private final String routing;

	private final boolean termStatistics;

	private final long version;

	private final VersionType versionType;

	// ---------------------------------------------------------------------------------------------

	public Operation(Builder builder) {

		this.doc = Objects.requireNonNull(builder.doc, "doc");
		this.fields = ModelTypeHelper.unmodifiableNonNull(builder.fields, "fields");
		this.fieldStatistics = Objects.requireNonNull(builder.fieldStatistics, "field_statistics");
		this.filter = Objects.requireNonNull(builder.filter, "filter");
		this.id = Objects.requireNonNull(builder.id, "_id");
		this.index = Objects.requireNonNull(builder.index, "_index");
		this.offsets = Objects.requireNonNull(builder.offsets, "offsets");
		this.payloads = Objects.requireNonNull(builder.payloads, "payloads");
		this.positions = Objects.requireNonNull(builder.positions, "positions");
		this.routing = Objects.requireNonNull(builder.routing, "routing");
		this.termStatistics = Objects.requireNonNull(builder.termStatistics, "term_statistics");
		this.version = Objects.requireNonNull(builder.version, "version");
		this.versionType = Objects.requireNonNull(builder.versionType, "version_type");

	}

	public Operation(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Required - API name: {@code doc}
	 */
	public JsonData doc() {
		return this.doc;
	}

	/**
	 * Required - API name: {@code fields}
	 */
	public List<String> fields() {
		return this.fields;
	}

	/**
	 * Required - API name: {@code field_statistics}
	 */
	public boolean fieldStatistics() {
		return this.fieldStatistics;
	}

	/**
	 * Required - API name: {@code filter}
	 */
	public Filter filter() {
		return this.filter;
	}

	/**
	 * Required - API name: {@code _id}
	 */
	public String id() {
		return this.id;
	}

	/**
	 * Required - API name: {@code _index}
	 */
	public String index() {
		return this.index;
	}

	/**
	 * Required - API name: {@code offsets}
	 */
	public boolean offsets() {
		return this.offsets;
	}

	/**
	 * Required - API name: {@code payloads}
	 */
	public boolean payloads() {
		return this.payloads;
	}

	/**
	 * Required - API name: {@code positions}
	 */
	public boolean positions() {
		return this.positions;
	}

	/**
	 * Required - API name: {@code routing}
	 */
	public String routing() {
		return this.routing;
	}

	/**
	 * Required - API name: {@code term_statistics}
	 */
	public boolean termStatistics() {
		return this.termStatistics;
	}

	/**
	 * Required - API name: {@code version}
	 */
	public long version() {
		return this.version;
	}

	/**
	 * Required - API name: {@code version_type}
	 */
	public VersionType versionType() {
		return this.versionType;
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

		generator.writeKey("doc");
		this.doc.serialize(generator, mapper);

		generator.writeKey("fields");
		generator.writeStartArray();
		for (String item0 : this.fields) {
			generator.write(item0);

		}
		generator.writeEnd();

		generator.writeKey("field_statistics");
		generator.write(this.fieldStatistics);

		generator.writeKey("filter");
		this.filter.serialize(generator, mapper);

		generator.writeKey("_id");
		generator.write(this.id);

		generator.writeKey("_index");
		generator.write(this.index);

		generator.writeKey("offsets");
		generator.write(this.offsets);

		generator.writeKey("payloads");
		generator.write(this.payloads);

		generator.writeKey("positions");
		generator.write(this.positions);

		generator.writeKey("routing");
		generator.write(this.routing);

		generator.writeKey("term_statistics");
		generator.write(this.termStatistics);

		generator.writeKey("version");
		generator.write(this.version);

		generator.writeKey("version_type");
		this.versionType.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Operation}.
	 */
	public static class Builder implements ObjectBuilder<Operation> {
		private JsonData doc;

		private List<String> fields;

		private Boolean fieldStatistics;

		private Filter filter;

		private String id;

		private String index;

		private Boolean offsets;

		private Boolean payloads;

		private Boolean positions;

		private String routing;

		private Boolean termStatistics;

		private Long version;

		private VersionType versionType;

		/**
		 * Required - API name: {@code doc}
		 */
		public Builder doc(JsonData value) {
			this.doc = value;
			return this;
		}

		/**
		 * Required - API name: {@code fields}
		 */
		public Builder fields(List<String> value) {
			this.fields = value;
			return this;
		}

		/**
		 * Required - API name: {@code fields}
		 */
		public Builder fields(String... value) {
			this.fields = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #fields(List)}, creating the list if needed.
		 */
		public Builder addFields(String value) {
			if (this.fields == null) {
				this.fields = new ArrayList<>();
			}
			this.fields.add(value);
			return this;
		}

		/**
		 * Required - API name: {@code field_statistics}
		 */
		public Builder fieldStatistics(boolean value) {
			this.fieldStatistics = value;
			return this;
		}

		/**
		 * Required - API name: {@code filter}
		 */
		public Builder filter(Filter value) {
			this.filter = value;
			return this;
		}

		/**
		 * Required - API name: {@code filter}
		 */
		public Builder filter(Function<Filter.Builder, ObjectBuilder<Filter>> fn) {
			return this.filter(fn.apply(new Filter.Builder()).build());
		}

		/**
		 * Required - API name: {@code _id}
		 */
		public Builder id(String value) {
			this.id = value;
			return this;
		}

		/**
		 * Required - API name: {@code _index}
		 */
		public Builder index(String value) {
			this.index = value;
			return this;
		}

		/**
		 * Required - API name: {@code offsets}
		 */
		public Builder offsets(boolean value) {
			this.offsets = value;
			return this;
		}

		/**
		 * Required - API name: {@code payloads}
		 */
		public Builder payloads(boolean value) {
			this.payloads = value;
			return this;
		}

		/**
		 * Required - API name: {@code positions}
		 */
		public Builder positions(boolean value) {
			this.positions = value;
			return this;
		}

		/**
		 * Required - API name: {@code routing}
		 */
		public Builder routing(String value) {
			this.routing = value;
			return this;
		}

		/**
		 * Required - API name: {@code term_statistics}
		 */
		public Builder termStatistics(boolean value) {
			this.termStatistics = value;
			return this;
		}

		/**
		 * Required - API name: {@code version}
		 */
		public Builder version(long value) {
			this.version = value;
			return this;
		}

		/**
		 * Required - API name: {@code version_type}
		 */
		public Builder versionType(VersionType value) {
			this.versionType = value;
			return this;
		}

		/**
		 * Builds a {@link Operation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Operation build() {

			return new Operation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Operation}
	 */
	public static final JsonpDeserializer<Operation> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Operation::setupOperationDeserializer, Builder::build);

	protected static void setupOperationDeserializer(DelegatingDeserializer<Operation.Builder> op) {

		op.add(Builder::doc, JsonData._DESERIALIZER, "doc");
		op.add(Builder::fields, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "fields");
		op.add(Builder::fieldStatistics, JsonpDeserializer.booleanDeserializer(), "field_statistics");
		op.add(Builder::filter, Filter._DESERIALIZER, "filter");
		op.add(Builder::id, JsonpDeserializer.stringDeserializer(), "_id");
		op.add(Builder::index, JsonpDeserializer.stringDeserializer(), "_index");
		op.add(Builder::offsets, JsonpDeserializer.booleanDeserializer(), "offsets");
		op.add(Builder::payloads, JsonpDeserializer.booleanDeserializer(), "payloads");
		op.add(Builder::positions, JsonpDeserializer.booleanDeserializer(), "positions");
		op.add(Builder::routing, JsonpDeserializer.stringDeserializer(), "routing");
		op.add(Builder::termStatistics, JsonpDeserializer.booleanDeserializer(), "term_statistics");
		op.add(Builder::version, JsonpDeserializer.longDeserializer(), "version");
		op.add(Builder::versionType, VersionType._DESERIALIZER, "version_type");

	}

}
