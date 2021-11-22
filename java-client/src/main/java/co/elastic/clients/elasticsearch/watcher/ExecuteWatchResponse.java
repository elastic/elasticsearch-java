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

package co.elastic.clients.elasticsearch.watcher;

import co.elastic.clients.elasticsearch.watcher.execute_watch.WatchRecord;
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
import java.lang.String;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

// typedef: watcher.execute_watch.Response
@JsonpDeserializable
public class ExecuteWatchResponse implements JsonpSerializable {
	private final String id;

	private final WatchRecord watchRecord;

	// ---------------------------------------------------------------------------------------------

	private ExecuteWatchResponse(Builder builder) {

		this.id = ModelTypeHelper.requireNonNull(builder.id, this, "id");
		this.watchRecord = ModelTypeHelper.requireNonNull(builder.watchRecord, this, "watchRecord");

	}

	public static ExecuteWatchResponse of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * Required - API name: {@code _id}
	 */
	public final String id() {
		return this.id;
	}

	/**
	 * Required - API name: {@code watch_record}
	 */
	public final WatchRecord watchRecord() {
		return this.watchRecord;
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

		generator.writeKey("_id");
		generator.write(this.id);

		generator.writeKey("watch_record");
		this.watchRecord.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ExecuteWatchResponse}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<ExecuteWatchResponse> {
		private String id;

		private WatchRecord watchRecord;

		/**
		 * Required - API name: {@code _id}
		 */
		public final Builder id(String value) {
			this.id = value;
			return this;
		}

		/**
		 * Required - API name: {@code watch_record}
		 */
		public final Builder watchRecord(WatchRecord value) {
			this.watchRecord = value;
			return this;
		}

		/**
		 * Required - API name: {@code watch_record}
		 */
		public final Builder watchRecord(Consumer<WatchRecord.Builder> fn) {
			WatchRecord.Builder builder = new WatchRecord.Builder();
			fn.accept(builder);
			return this.watchRecord(builder.build());
		}

		/**
		 * Builds a {@link ExecuteWatchResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ExecuteWatchResponse build() {
			_checkSingleUse();

			return new ExecuteWatchResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ExecuteWatchResponse}
	 */
	public static final JsonpDeserializer<ExecuteWatchResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ExecuteWatchResponse::setupExecuteWatchResponseDeserializer);

	protected static void setupExecuteWatchResponseDeserializer(ObjectDeserializer<ExecuteWatchResponse.Builder> op) {

		op.add(Builder::id, JsonpDeserializer.stringDeserializer(), "_id");
		op.add(Builder::watchRecord, WatchRecord._DESERIALIZER, "watch_record");

	}

}
