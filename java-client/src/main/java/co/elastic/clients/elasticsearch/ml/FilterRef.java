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

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: ml._types.FilterRef
public final class FilterRef implements JsonpSerializable {
	private final String filterId;

	@Nullable
	private final FilterType filterType;

	// ---------------------------------------------------------------------------------------------

	public FilterRef(Builder builder) {

		this.filterId = Objects.requireNonNull(builder.filterId, "filter_id");
		this.filterType = builder.filterType;

	}

	/**
	 * The identifier for the filter.
	 * <p>
	 * API name: {@code filter_id}
	 */
	public String filterId() {
		return this.filterId;
	}

	/**
	 * If set to <code>include</code>, the rule applies for values in the filter. If
	 * set to <code>exclude</code>, the rule applies for values not in the filter.
	 * <p>
	 * API name: {@code filter_type}
	 */
	@Nullable
	public FilterType filterType() {
		return this.filterType;
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

		generator.writeKey("filter_id");
		generator.write(this.filterId);

		if (this.filterType != null) {

			generator.writeKey("filter_type");
			this.filterType.serialize(generator, mapper);
		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link FilterRef}.
	 */
	public static class Builder implements ObjectBuilder<FilterRef> {
		private String filterId;

		@Nullable
		private FilterType filterType;

		/**
		 * The identifier for the filter.
		 * <p>
		 * API name: {@code filter_id}
		 */
		public Builder filterId(String value) {
			this.filterId = value;
			return this;
		}

		/**
		 * If set to <code>include</code>, the rule applies for values in the filter. If
		 * set to <code>exclude</code>, the rule applies for values not in the filter.
		 * <p>
		 * API name: {@code filter_type}
		 */
		public Builder filterType(@Nullable FilterType value) {
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
	 * Json deserializer for {@link FilterRef}
	 */
	public static final JsonpDeserializer<FilterRef> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, FilterRef::setupFilterRefDeserializer);

	protected static void setupFilterRefDeserializer(DelegatingDeserializer<FilterRef.Builder> op) {

		op.add(Builder::filterId, JsonpDeserializer.stringDeserializer(), "filter_id");
		op.add(Builder::filterType, FilterType.DESERIALIZER, "filter_type");

	}

}
