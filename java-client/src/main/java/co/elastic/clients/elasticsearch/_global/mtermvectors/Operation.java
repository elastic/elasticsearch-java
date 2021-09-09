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

package co.elastic.clients.elasticsearch._global.mtermvectors;

import co.elastic.clients.elasticsearch._global.termvectors.Filter;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.mtermvectors.Operation
public final class Operation implements ToJsonp {
	private final JsonValue doc;

	private final List<String> fields;

	private final Boolean fieldStatistics;

	private final Filter filter;

	private final String id;

	private final String index;

	private final Boolean offsets;

	private final Boolean payloads;

	private final Boolean positions;

	private final String routing;

	private final Boolean termStatistics;

	private final Number version;

	private final JsonValue versionType;

	// ---------------------------------------------------------------------------------------------

	protected Operation(Builder builder) {

		this.doc = Objects.requireNonNull(builder.doc, "doc");
		this.fields = Objects.requireNonNull(builder.fields, "fields");
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

	/**
	 * API name: {@code doc}
	 */
	public JsonValue doc() {
		return this.doc;
	}

	/**
	 * API name: {@code fields}
	 */
	public List<String> fields() {
		return this.fields;
	}

	/**
	 * API name: {@code field_statistics}
	 */
	public Boolean fieldStatistics() {
		return this.fieldStatistics;
	}

	/**
	 * API name: {@code filter}
	 */
	public Filter filter() {
		return this.filter;
	}

	/**
	 * API name: {@code _id}
	 */
	public String id() {
		return this.id;
	}

	/**
	 * API name: {@code _index}
	 */
	public String index() {
		return this.index;
	}

	/**
	 * API name: {@code offsets}
	 */
	public Boolean offsets() {
		return this.offsets;
	}

	/**
	 * API name: {@code payloads}
	 */
	public Boolean payloads() {
		return this.payloads;
	}

	/**
	 * API name: {@code positions}
	 */
	public Boolean positions() {
		return this.positions;
	}

	/**
	 * API name: {@code routing}
	 */
	public String routing() {
		return this.routing;
	}

	/**
	 * API name: {@code term_statistics}
	 */
	public Boolean termStatistics() {
		return this.termStatistics;
	}

	/**
	 * API name: {@code version}
	 */
	public Number version() {
		return this.version;
	}

	/**
	 * API name: {@code version_type}
	 */
	public JsonValue versionType() {
		return this.versionType;
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

		generator.writeKey("doc");
		generator.write(this.doc);

		generator.writeKey("fields");
		generator.writeStartArray();
		for (String item0 : this.fields) {
			generator.write(item0);

		}
		generator.writeEnd();

		generator.writeKey("field_statistics");
		generator.write(this.fieldStatistics);

		generator.writeKey("filter");
		this.filter.toJsonp(generator, mapper);

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
		generator.write(this.version.doubleValue());

		generator.writeKey("version_type");
		generator.write(this.versionType);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Operation}.
	 */
	public static class Builder implements ObjectBuilder<Operation> {
		private JsonValue doc;

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

		private Number version;

		private JsonValue versionType;

		/**
		 * API name: {@code doc}
		 */
		public Builder doc(JsonValue value) {
			this.doc = value;
			return this;
		}

		/**
		 * API name: {@code fields}
		 */
		public Builder fields(List<String> value) {
			this.fields = value;
			return this;
		}

		/**
		 * API name: {@code fields}
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
		 * API name: {@code field_statistics}
		 */
		public Builder fieldStatistics(Boolean value) {
			this.fieldStatistics = value;
			return this;
		}

		/**
		 * API name: {@code filter}
		 */
		public Builder filter(Filter value) {
			this.filter = value;
			return this;
		}

		/**
		 * API name: {@code filter}
		 */
		public Builder filter(Function<Filter.Builder, ObjectBuilder<Filter>> fn) {
			return this.filter(fn.apply(new Filter.Builder()).build());
		}

		/**
		 * API name: {@code _id}
		 */
		public Builder id(String value) {
			this.id = value;
			return this;
		}

		/**
		 * API name: {@code _index}
		 */
		public Builder index(String value) {
			this.index = value;
			return this;
		}

		/**
		 * API name: {@code offsets}
		 */
		public Builder offsets(Boolean value) {
			this.offsets = value;
			return this;
		}

		/**
		 * API name: {@code payloads}
		 */
		public Builder payloads(Boolean value) {
			this.payloads = value;
			return this;
		}

		/**
		 * API name: {@code positions}
		 */
		public Builder positions(Boolean value) {
			this.positions = value;
			return this;
		}

		/**
		 * API name: {@code routing}
		 */
		public Builder routing(String value) {
			this.routing = value;
			return this;
		}

		/**
		 * API name: {@code term_statistics}
		 */
		public Builder termStatistics(Boolean value) {
			this.termStatistics = value;
			return this;
		}

		/**
		 * API name: {@code version}
		 */
		public Builder version(Number value) {
			this.version = value;
			return this;
		}

		/**
		 * API name: {@code version_type}
		 */
		public Builder versionType(JsonValue value) {
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
	 * Json deserializer for Operation
	 */
	public static final JsonpDeserializer<Operation> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, Operation::setupOperationDeserializer);

	protected static void setupOperationDeserializer(DelegatingDeserializer<Operation.Builder> op) {

		op.add(Builder::doc, JsonpDeserializer.jsonValueDeserializer(), "doc");
		op.add(Builder::fields, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "fields");
		op.add(Builder::fieldStatistics, JsonpDeserializer.booleanDeserializer(), "field_statistics");
		op.add(Builder::filter, Filter.DESERIALIZER, "filter");
		op.add(Builder::id, JsonpDeserializer.stringDeserializer(), "_id");
		op.add(Builder::index, JsonpDeserializer.stringDeserializer(), "_index");
		op.add(Builder::offsets, JsonpDeserializer.booleanDeserializer(), "offsets");
		op.add(Builder::payloads, JsonpDeserializer.booleanDeserializer(), "payloads");
		op.add(Builder::positions, JsonpDeserializer.booleanDeserializer(), "positions");
		op.add(Builder::routing, JsonpDeserializer.stringDeserializer(), "routing");
		op.add(Builder::termStatistics, JsonpDeserializer.booleanDeserializer(), "term_statistics");
		op.add(Builder::version, JsonpDeserializer.numberDeserializer(), "version");
		op.add(Builder::versionType, JsonpDeserializer.jsonValueDeserializer(), "version_type");

	}

}
