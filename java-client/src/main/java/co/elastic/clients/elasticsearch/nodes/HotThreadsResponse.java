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

package co.elastic.clients.elasticsearch.nodes;

import co.elastic.clients.elasticsearch.nodes.hot_threads.HotThread;
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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: nodes.hot_threads.Response
@JsonpDeserializable
public class HotThreadsResponse implements JsonpSerializable {
	private final List<HotThread> hotThreads;

	// ---------------------------------------------------------------------------------------------

	private HotThreadsResponse(Builder builder) {

		this.hotThreads = ModelTypeHelper.unmodifiableRequired(builder.hotThreads, this, "hotThreads");

	}

	public static HotThreadsResponse of(Function<Builder, ObjectBuilder<HotThreadsResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code hot_threads}
	 */
	public final List<HotThread> hotThreads() {
		return this.hotThreads;
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

		if (ModelTypeHelper.isDefined(this.hotThreads)) {
			generator.writeKey("hot_threads");
			generator.writeStartArray();
			for (HotThread item0 : this.hotThreads) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link HotThreadsResponse}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<HotThreadsResponse> {
		private List<HotThread> hotThreads;

		/**
		 * Required - API name: {@code hot_threads}
		 */
		public final Builder hotThreads(List<HotThread> value) {
			this.hotThreads = value;
			return this;
		}

		/**
		 * Required - API name: {@code hot_threads}
		 */
		public final Builder hotThreads(HotThread... value) {
			this.hotThreads = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - API name: {@code hot_threads}
		 */
		@SafeVarargs
		public final Builder hotThreads(Function<HotThread.Builder, ObjectBuilder<HotThread>>... fns) {
			this.hotThreads = new ArrayList<>(fns.length);
			for (Function<HotThread.Builder, ObjectBuilder<HotThread>> fn : fns) {
				this.hotThreads.add(fn.apply(new HotThread.Builder()).build());
			}
			return this;
		}

		/**
		 * Builds a {@link HotThreadsResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public HotThreadsResponse build() {
			_checkSingleUse();

			return new HotThreadsResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link HotThreadsResponse}
	 */
	public static final JsonpDeserializer<HotThreadsResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, HotThreadsResponse::setupHotThreadsResponseDeserializer, Builder::build);

	protected static void setupHotThreadsResponseDeserializer(DelegatingDeserializer<HotThreadsResponse.Builder> op) {

		op.add(Builder::hotThreads, JsonpDeserializer.arrayDeserializer(HotThread._DESERIALIZER), "hot_threads");

	}

}
