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

// typedef: ml.get_datafeeds.Response

/**
 *
 * @see <a href="../doc-files/api-spec.html#ml.get_datafeeds.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class GetDatafeedsResponse implements JsonpSerializable {
	private final long count;

	private final List<Datafeed> datafeeds;

	// ---------------------------------------------------------------------------------------------

	private GetDatafeedsResponse(Builder builder) {

		this.count = ApiTypeHelper.requireNonNull(builder.count, this, "count");
		this.datafeeds = ApiTypeHelper.unmodifiableRequired(builder.datafeeds, this, "datafeeds");

	}

	public static GetDatafeedsResponse of(Function<Builder, ObjectBuilder<GetDatafeedsResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code count}
	 */
	public final long count() {
		return this.count;
	}

	/**
	 * Required - API name: {@code datafeeds}
	 */
	public final List<Datafeed> datafeeds() {
		return this.datafeeds;
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

		if (ApiTypeHelper.isDefined(this.datafeeds)) {
			generator.writeKey("datafeeds");
			generator.writeStartArray();
			for (Datafeed item0 : this.datafeeds) {
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
	 * Builder for {@link GetDatafeedsResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<GetDatafeedsResponse> {
		private Long count;

		private List<Datafeed> datafeeds;

		/**
		 * Required - API name: {@code count}
		 */
		public final Builder count(long value) {
			this.count = value;
			return this;
		}

		/**
		 * Required - API name: {@code datafeeds}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>datafeeds</code>.
		 */
		public final Builder datafeeds(List<Datafeed> list) {
			this.datafeeds = _listAddAll(this.datafeeds, list);
			return this;
		}

		/**
		 * Required - API name: {@code datafeeds}
		 * <p>
		 * Adds one or more values to <code>datafeeds</code>.
		 */
		public final Builder datafeeds(Datafeed value, Datafeed... values) {
			this.datafeeds = _listAdd(this.datafeeds, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code datafeeds}
		 * <p>
		 * Adds a value to <code>datafeeds</code> using a builder lambda.
		 */
		public final Builder datafeeds(Function<Datafeed.Builder, ObjectBuilder<Datafeed>> fn) {
			return datafeeds(fn.apply(new Datafeed.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GetDatafeedsResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetDatafeedsResponse build() {
			_checkSingleUse();

			return new GetDatafeedsResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GetDatafeedsResponse}
	 */
	public static final JsonpDeserializer<GetDatafeedsResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, GetDatafeedsResponse::setupGetDatafeedsResponseDeserializer);

	protected static void setupGetDatafeedsResponseDeserializer(ObjectDeserializer<GetDatafeedsResponse.Builder> op) {

		op.add(Builder::count, JsonpDeserializer.longDeserializer(), "count");
		op.add(Builder::datafeeds, JsonpDeserializer.arrayDeserializer(Datafeed._DESERIALIZER), "datafeeds");

	}

}
