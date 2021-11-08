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
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.get_filters.Response
@JsonpDeserializable
public class GetFiltersResponse implements JsonpSerializable {
	private final long count;

	private final List<Filter> filters;

	// ---------------------------------------------------------------------------------------------

	private GetFiltersResponse(Builder builder) {

		this.count = ModelTypeHelper.requireNonNull(builder.count, this, "count");
		this.filters = ModelTypeHelper.unmodifiableRequired(builder.filters, this, "filters");

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

		if (ModelTypeHelper.isDefined(this.filters)) {
			generator.writeKey("filters");
			generator.writeStartArray();
			for (Filter item0 : this.filters) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetFiltersResponse}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<GetFiltersResponse> {
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
		 */
		public final Builder filters(List<Filter> value) {
			this.filters = value;
			return this;
		}

		/**
		 * Required - API name: {@code filters}
		 */
		public final Builder filters(Filter... value) {
			this.filters = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - API name: {@code filters}
		 */
		@SafeVarargs
		public final Builder filters(Function<Filter.Builder, ObjectBuilder<Filter>>... fns) {
			this.filters = new ArrayList<>(fns.length);
			for (Function<Filter.Builder, ObjectBuilder<Filter>> fn : fns) {
				this.filters.add(fn.apply(new Filter.Builder()).build());
			}
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
			.lazy(Builder::new, GetFiltersResponse::setupGetFiltersResponseDeserializer, Builder::build);

	protected static void setupGetFiltersResponseDeserializer(DelegatingDeserializer<GetFiltersResponse.Builder> op) {

		op.add(Builder::count, JsonpDeserializer.longDeserializer(), "count");
		op.add(Builder::filters, JsonpDeserializer.arrayDeserializer(Filter._DESERIALIZER), "filters");

	}

}
