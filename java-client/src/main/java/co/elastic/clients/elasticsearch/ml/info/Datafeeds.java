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

package co.elastic.clients.elasticsearch.ml.info;

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
import java.lang.Integer;
import java.util.Objects;
import java.util.function.Function;

// typedef: ml.info.Datafeeds

/**
 *
 * @see <a href="../../doc-files/api-spec.html#ml.info.Datafeeds">API
 *      specification</a>
 */
@JsonpDeserializable
public class Datafeeds implements JsonpSerializable {
	private final int scrollSize;

	// ---------------------------------------------------------------------------------------------

	private Datafeeds(Builder builder) {

		this.scrollSize = ApiTypeHelper.requireNonNull(builder.scrollSize, this, "scrollSize");

	}

	public static Datafeeds of(Function<Builder, ObjectBuilder<Datafeeds>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code scroll_size}
	 */
	public final int scrollSize() {
		return this.scrollSize;
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

		generator.writeKey("scroll_size");
		generator.write(this.scrollSize);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Datafeeds}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<Datafeeds> {
		private Integer scrollSize;

		/**
		 * Required - API name: {@code scroll_size}
		 */
		public final Builder scrollSize(int value) {
			this.scrollSize = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link Datafeeds}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Datafeeds build() {
			_checkSingleUse();

			return new Datafeeds(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Datafeeds}
	 */
	public static final JsonpDeserializer<Datafeeds> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Datafeeds::setupDatafeedsDeserializer);

	protected static void setupDatafeedsDeserializer(ObjectDeserializer<Datafeeds.Builder> op) {

		op.add(Builder::scrollSize, JsonpDeserializer.integerDeserializer(), "scroll_size");

	}

}
