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
import java.lang.Number;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.get_categories.Response
public final class GetCategoriesResponse implements JsonpSerializable {
	private final List<Category> categories;

	private final Number count;

	// ---------------------------------------------------------------------------------------------

	public GetCategoriesResponse(Builder builder) {

		this.categories = Objects.requireNonNull(builder.categories, "categories");
		this.count = Objects.requireNonNull(builder.count, "count");

	}

	/**
	 * API name: {@code categories}
	 */
	public List<Category> categories() {
		return this.categories;
	}

	/**
	 * API name: {@code count}
	 */
	public Number count() {
		return this.count;
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

		generator.writeKey("categories");
		generator.writeStartArray();
		for (Category item0 : this.categories) {
			item0.serialize(generator, mapper);

		}
		generator.writeEnd();

		generator.writeKey("count");
		generator.write(this.count.doubleValue());

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetCategoriesResponse}.
	 */
	public static class Builder implements ObjectBuilder<GetCategoriesResponse> {
		private List<Category> categories;

		private Number count;

		/**
		 * API name: {@code categories}
		 */
		public Builder categories(List<Category> value) {
			this.categories = value;
			return this;
		}

		/**
		 * API name: {@code categories}
		 */
		public Builder categories(Category... value) {
			this.categories = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #categories(List)}, creating the list if needed.
		 */
		public Builder addCategories(Category value) {
			if (this.categories == null) {
				this.categories = new ArrayList<>();
			}
			this.categories.add(value);
			return this;
		}

		/**
		 * Set {@link #categories(List)} to a singleton list.
		 */
		public Builder categories(Function<Category.Builder, ObjectBuilder<Category>> fn) {
			return this.categories(fn.apply(new Category.Builder()).build());
		}

		/**
		 * Add a value to {@link #categories(List)}, creating the list if needed.
		 */
		public Builder addCategories(Function<Category.Builder, ObjectBuilder<Category>> fn) {
			return this.addCategories(fn.apply(new Category.Builder()).build());
		}

		/**
		 * API name: {@code count}
		 */
		public Builder count(Number value) {
			this.count = value;
			return this;
		}

		/**
		 * Builds a {@link GetCategoriesResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetCategoriesResponse build() {

			return new GetCategoriesResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GetCategoriesResponse}
	 */
	public static final JsonpDeserializer<GetCategoriesResponse> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, GetCategoriesResponse::setupGetCategoriesResponseDeserializer);

	protected static void setupGetCategoriesResponseDeserializer(
			DelegatingDeserializer<GetCategoriesResponse.Builder> op) {

		op.add(Builder::categories, JsonpDeserializer.arrayDeserializer(Category.DESERIALIZER), "categories");
		op.add(Builder::count, JsonpDeserializer.numberDeserializer(), "count");

	}

}
