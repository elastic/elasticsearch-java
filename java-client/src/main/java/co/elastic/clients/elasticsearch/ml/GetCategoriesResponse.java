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

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.get_categories.Response

/**
 *
 * @see <a href="../doc-files/api-spec.html#ml.get_categories.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class GetCategoriesResponse implements JsonpSerializable {
	private final List<Category> categories;

	private final long count;

	// ---------------------------------------------------------------------------------------------

	private GetCategoriesResponse(Builder builder) {

		this.categories = ApiTypeHelper.unmodifiableRequired(builder.categories, this, "categories");
		this.count = ApiTypeHelper.requireNonNull(builder.count, this, "count");

	}

	public static GetCategoriesResponse of(Function<Builder, ObjectBuilder<GetCategoriesResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code categories}
	 */
	public final List<Category> categories() {
		return this.categories;
	}

	/**
	 * Required - API name: {@code count}
	 */
	public final long count() {
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

		if (ApiTypeHelper.isDefined(this.categories)) {
			generator.writeKey("categories");
			generator.writeStartArray();
			for (Category item0 : this.categories) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		generator.writeKey("count");
		generator.write(this.count);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetCategoriesResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<GetCategoriesResponse> {
		private List<Category> categories;

		private Long count;

		/**
		 * Required - API name: {@code categories}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>categories</code>.
		 */
		public final Builder categories(List<Category> list) {
			this.categories = _listAddAll(this.categories, list);
			return this;
		}

		/**
		 * Required - API name: {@code categories}
		 * <p>
		 * Adds one or more values to <code>categories</code>.
		 */
		public final Builder categories(Category value, Category... values) {
			this.categories = _listAdd(this.categories, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code categories}
		 * <p>
		 * Adds a value to <code>categories</code> using a builder lambda.
		 */
		public final Builder categories(Function<Category.Builder, ObjectBuilder<Category>> fn) {
			return categories(fn.apply(new Category.Builder()).build());
		}

		/**
		 * Required - API name: {@code count}
		 */
		public final Builder count(long value) {
			this.count = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GetCategoriesResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetCategoriesResponse build() {
			_checkSingleUse();

			return new GetCategoriesResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GetCategoriesResponse}
	 */
	public static final JsonpDeserializer<GetCategoriesResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, GetCategoriesResponse::setupGetCategoriesResponseDeserializer);

	protected static void setupGetCategoriesResponseDeserializer(ObjectDeserializer<GetCategoriesResponse.Builder> op) {

		op.add(Builder::categories, JsonpDeserializer.arrayDeserializer(Category._DESERIALIZER), "categories");
		op.add(Builder::count, JsonpDeserializer.longDeserializer(), "count");

	}

}
