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

package co.elastic.clients.elasticsearch.cat;

import co.elastic.clients.elasticsearch.cat.thread_pool.ThreadPoolRecord;
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

// typedef: cat.thread_pool.Response
@JsonpDeserializable
public class ThreadPoolResponse implements JsonpSerializable {
	private final List<ThreadPoolRecord> valueBody;

	// ---------------------------------------------------------------------------------------------

	private ThreadPoolResponse(Builder builder) {

		this.valueBody = ModelTypeHelper.unmodifiableRequired(builder.valueBody, this, "valueBody");

	}

	public static ThreadPoolResponse of(Function<Builder, ObjectBuilder<ThreadPoolResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - Response value.
	 * <p>
	 * API name: {@code _value_body}
	 */
	public final List<ThreadPoolRecord> valueBody() {
		return this.valueBody;
	}

	/**
	 * Serialize this value to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartArray();
		for (ThreadPoolRecord item0 : this.valueBody) {
			item0.serialize(generator, mapper);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ThreadPoolResponse}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<ThreadPoolResponse> {
		private List<ThreadPoolRecord> valueBody;

		/**
		 * Required - Response value.
		 * <p>
		 * API name: {@code _value_body}
		 */
		public final Builder valueBody(List<ThreadPoolRecord> value) {
			this.valueBody = value;
			return this;
		}

		/**
		 * Required - Response value.
		 * <p>
		 * API name: {@code _value_body}
		 */
		public final Builder valueBody(ThreadPoolRecord... value) {
			this.valueBody = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - Response value.
		 * <p>
		 * API name: {@code _value_body}
		 */
		@SafeVarargs
		public final Builder valueBody(Function<ThreadPoolRecord.Builder, ObjectBuilder<ThreadPoolRecord>>... fns) {
			this.valueBody = new ArrayList<>(fns.length);
			for (Function<ThreadPoolRecord.Builder, ObjectBuilder<ThreadPoolRecord>> fn : fns) {
				this.valueBody.add(fn.apply(new ThreadPoolRecord.Builder()).build());
			}
			return this;
		}

		/**
		 * Builds a {@link ThreadPoolResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ThreadPoolResponse build() {
			_checkSingleUse();

			return new ThreadPoolResponse(this);
		}
	}

	public static final JsonpDeserializer<ThreadPoolResponse> _DESERIALIZER = createThreadPoolResponseDeserializer();
	protected static JsonpDeserializer<ThreadPoolResponse> createThreadPoolResponseDeserializer() {

		JsonpDeserializer<List<ThreadPoolRecord>> valueDeserializer = JsonpDeserializer
				.arrayDeserializer(ThreadPoolRecord._DESERIALIZER);

		return JsonpDeserializer.of(valueDeserializer.acceptedEvents(), (parser, mapper, event) -> new Builder()
				.valueBody(valueDeserializer.deserialize(parser, mapper, event)).build());
	}

}
