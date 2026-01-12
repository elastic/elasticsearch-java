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

package co.elastic.clients.elasticsearch.esql;

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
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

//----------------------------------------------------------------
//       THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------------------
//
// This code is generated from the Elasticsearch API specification
// at https://github.com/elastic/elasticsearch-specification
//
// Manual updates to this file will be lost when the code is
// re-generated.
//
// If you find a property that is missing or wrongly typed, please
// open an issue or a PR on the API specification repository.
//
//----------------------------------------------------------------

// typedef: esql.get_view.Response

/**
 *
 * @see <a href="../doc-files/api-spec.html#esql.get_view.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class GetViewResponse implements JsonpSerializable {
	private final List<ESQLView> views;

	// ---------------------------------------------------------------------------------------------

	private GetViewResponse(Builder builder) {

		this.views = ApiTypeHelper.unmodifiableRequired(builder.views, this, "views");

	}

	public static GetViewResponse of(Function<Builder, ObjectBuilder<GetViewResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code views}
	 */
	public final List<ESQLView> views() {
		return this.views;
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

		if (ApiTypeHelper.isDefined(this.views)) {
			generator.writeKey("views");
			generator.writeStartArray();
			for (ESQLView item0 : this.views) {
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
	 * Builder for {@link GetViewResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<GetViewResponse> {
		private List<ESQLView> views;

		/**
		 * Required - API name: {@code views}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>views</code>.
		 */
		public final Builder views(List<ESQLView> list) {
			this.views = _listAddAll(this.views, list);
			return this;
		}

		/**
		 * Required - API name: {@code views}
		 * <p>
		 * Adds one or more values to <code>views</code>.
		 */
		public final Builder views(ESQLView value, ESQLView... values) {
			this.views = _listAdd(this.views, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code views}
		 * <p>
		 * Adds a value to <code>views</code> using a builder lambda.
		 */
		public final Builder views(Function<ESQLView.Builder, ObjectBuilder<ESQLView>> fn) {
			return views(fn.apply(new ESQLView.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GetViewResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetViewResponse build() {
			_checkSingleUse();

			return new GetViewResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GetViewResponse}
	 */
	public static final JsonpDeserializer<GetViewResponse> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			GetViewResponse::setupGetViewResponseDeserializer);

	protected static void setupGetViewResponseDeserializer(ObjectDeserializer<GetViewResponse.Builder> op) {

		op.add(Builder::views, JsonpDeserializer.arrayDeserializer(ESQLView._DESERIALIZER), "views");

	}

}
