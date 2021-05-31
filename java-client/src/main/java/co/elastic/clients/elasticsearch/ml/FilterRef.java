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

package co.elastic.clients.elasticsearch.ml;

import co.elastic.clients.json.DelegatingJsonpValueParser;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpObjectBuilderParser;
import co.elastic.clients.json.JsonpObjectParser;
import co.elastic.clients.json.JsonpValueParser;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: ml._types.FilterRef
public final class FilterRef implements ToJsonp {
	private final String filterId;

	private final JsonValue filterType;

	// ---------------------------------------------------------------------------------------------

	protected FilterRef(Builder builder) {

		this.filterId = Objects.requireNonNull(builder.filterId, "filter_id");
		this.filterType = Objects.requireNonNull(builder.filterType, "filter_type");

	}

	/**
	 * API name: {@code filter_id}
	 */
	public String filterId() {
		return this.filterId;
	}

	/**
	 * API name: {@code filter_type}
	 */
	public JsonValue filterType() {
		return this.filterType;
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

		generator.writeKey("filter_id");
		generator.write(this.filterId);

		generator.writeKey("filter_type");
		generator.write(this.filterType);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link FilterRef}.
	 */
	public static class Builder implements ObjectBuilder<FilterRef> {
		private String filterId;

		private JsonValue filterType;

		/**
		 * API name: {@code filter_id}
		 */
		public Builder filterId(String value) {
			this.filterId = value;
			return this;
		}

		/**
		 * API name: {@code filter_type}
		 */
		public Builder filterType(JsonValue value) {
			this.filterType = value;
			return this;
		}

		/**
		 * Builds a {@link FilterRef}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public FilterRef build() {

			return new FilterRef(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json parser for FilterRef
	 */
	public static final JsonpValueParser<FilterRef> JSONP_PARSER = JsonpObjectBuilderParser
			.createForObject(Builder::new, FilterRef::setupFilterRefParser);

	protected static void setupFilterRefParser(DelegatingJsonpValueParser<FilterRef.Builder> op) {

		op.add(Builder::filterId, JsonpValueParser.stringParser(), "filter_id");
		op.add(Builder::filterType, JsonpValueParser.jsonValueParser(), "filter_type");

	}

}
