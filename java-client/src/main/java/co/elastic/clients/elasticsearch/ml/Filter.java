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
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml._types.Filter
@JsonpDeserializable
public final class Filter implements JsonpSerializable {
	@Nullable
	private final String description;

	private final String filterId;

	private final List<String> items;

	// ---------------------------------------------------------------------------------------------

	public Filter(Builder builder) {

		this.description = builder.description;
		this.filterId = Objects.requireNonNull(builder.filterId, "filter_id");
		this.items = ModelTypeHelper.unmodifiableNonNull(builder.items, "items");

	}

	public Filter(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * API name: {@code description}
	 */
	@Nullable
	public String description() {
		return this.description;
	}

	/**
	 * Required - API name: {@code filter_id}
	 */
	public String filterId() {
		return this.filterId;
	}

	/**
	 * Required - API name: {@code items}
	 */
	public List<String> items() {
		return this.items;
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

		if (this.description != null) {

			generator.writeKey("description");
			generator.write(this.description);

		}

		generator.writeKey("filter_id");
		generator.write(this.filterId);

		generator.writeKey("items");
		generator.writeStartArray();
		for (String item0 : this.items) {
			generator.write(item0);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Filter}.
	 */
	public static class Builder implements ObjectBuilder<Filter> {
		@Nullable
		private String description;

		private String filterId;

		private List<String> items;

		/**
		 * API name: {@code description}
		 */
		public Builder description(@Nullable String value) {
			this.description = value;
			return this;
		}

		/**
		 * Required - API name: {@code filter_id}
		 */
		public Builder filterId(String value) {
			this.filterId = value;
			return this;
		}

		/**
		 * Required - API name: {@code items}
		 */
		public Builder items(List<String> value) {
			this.items = value;
			return this;
		}

		/**
		 * Required - API name: {@code items}
		 */
		public Builder items(String... value) {
			this.items = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #items(List)}, creating the list if needed.
		 */
		public Builder addItems(String value) {
			if (this.items == null) {
				this.items = new ArrayList<>();
			}
			this.items.add(value);
			return this;
		}

		/**
		 * Builds a {@link Filter}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Filter build() {

			return new Filter(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Filter}
	 */
	public static final JsonpDeserializer<Filter> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Filter::setupFilterDeserializer, Builder::build);

	protected static void setupFilterDeserializer(DelegatingDeserializer<Filter.Builder> op) {

		op.add(Builder::description, JsonpDeserializer.stringDeserializer(), "description");
		op.add(Builder::filterId, JsonpDeserializer.stringDeserializer(), "filter_id");
		op.add(Builder::items, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "items");

	}

}
