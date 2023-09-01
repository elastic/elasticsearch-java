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

// typedef: ml.get_filters.Response

/**
 *
 * @see <a href="../doc-files/api-spec.html#ml.get_filters.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class GetFiltersResponse implements JsonpSerializable {
	private final long count;

	private final List<Filter> filters;

	// ---------------------------------------------------------------------------------------------

	private GetFiltersResponse(Builder builder) {

		this.count = ApiTypeHelper.requireNonNull(builder.count, this, "count");
		this.filters = ApiTypeHelper.unmodifiableRequired(builder.filters, this, "filters");

	}

	public static GetFiltersResponse of(Function<Builder, ObjectBuilder<GetFiltersResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code count}
	 */
	public final long count() {
		return this.count;
	}

	/**
	 * Required - API name: {@code filters}
	 */
	public final List<Filter> filters() {
		return this.filters;
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

		generator.writeKey("count");
		generator.write(this.count);

		if (ApiTypeHelper.isDefined(this.filters)) {
			generator.writeKey("filters");
			generator.writeStartArray();
			for (Filter item0 : this.filters) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetFiltersResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<GetFiltersResponse> {
		private Long count;

		private List<Filter> filters;

		/**
		 * Required - API name: {@code count}
		 */
		public final Builder count(long value) {
			this.count = value;
			return this;
		}

		/**
		 * Required - API name: {@code filters}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>filters</code>.
		 */
		public final Builder filters(List<Filter> list) {
			this.filters = _listAddAll(this.filters, list);
			return this;
		}

		/**
		 * Required - API name: {@code filters}
		 * <p>
		 * Adds one or more values to <code>filters</code>.
		 */
		public final Builder filters(Filter value, Filter... values) {
			this.filters = _listAdd(this.filters, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code filters}
		 * <p>
		 * Adds a value to <code>filters</code> using a builder lambda.
		 */
		public final Builder filters(Function<Filter.Builder, ObjectBuilder<Filter>> fn) {
			return filters(fn.apply(new Filter.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GetFiltersResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetFiltersResponse build() {
			_checkSingleUse();

			return new GetFiltersResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GetFiltersResponse}
	 */
	public static final JsonpDeserializer<GetFiltersResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, GetFiltersResponse::setupGetFiltersResponseDeserializer);

	protected static void setupGetFiltersResponseDeserializer(ObjectDeserializer<GetFiltersResponse.Builder> op) {

		op.add(Builder::count, JsonpDeserializer.longDeserializer(), "count");
		op.add(Builder::filters, JsonpDeserializer.arrayDeserializer(Filter._DESERIALIZER), "filters");

	}

}
