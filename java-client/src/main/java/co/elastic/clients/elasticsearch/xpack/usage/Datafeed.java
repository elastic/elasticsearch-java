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

package co.elastic.clients.elasticsearch.xpack.usage;

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
import java.util.Objects;
import java.util.function.Function;

// typedef: xpack.usage.Datafeed

/**
 *
 * @see <a href="../../doc-files/api-spec.html#xpack.usage.Datafeed">API
 *      specification</a>
 */
@JsonpDeserializable
public class Datafeed implements JsonpSerializable {
	private final long count;

	// ---------------------------------------------------------------------------------------------

	private Datafeed(Builder builder) {

		this.count = ApiTypeHelper.requireNonNull(builder.count, this, "count");

	}

	public static Datafeed of(Function<Builder, ObjectBuilder<Datafeed>> fn) {
		return fn.apply(new Builder()).build();
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

		generator.writeKey("count");
		generator.write(this.count);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Datafeed}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<Datafeed> {
		private Long count;

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
		 * Builds a {@link Datafeed}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Datafeed build() {
			_checkSingleUse();

			return new Datafeed(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Datafeed}
	 */
	public static final JsonpDeserializer<Datafeed> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Datafeed::setupDatafeedDeserializer);

	protected static void setupDatafeedDeserializer(ObjectDeserializer<Datafeed.Builder> op) {

		op.add(Builder::count, JsonpDeserializer.longDeserializer(), "count");

	}

}
