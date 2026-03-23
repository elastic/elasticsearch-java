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

package co.elastic.clients.elasticsearch.core.reindex_rethrottle;

import co.elastic.clients.elasticsearch._types.ReindexStatus;
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
import java.lang.Boolean;
import java.lang.Long;
import java.lang.String;
import java.util.List;
import java.util.Map;
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

// typedef: _global.reindex_rethrottle.ReindexTask

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_global.reindex_rethrottle.ReindexTask">API
 *      specification</a>
 */
@JsonpDeserializable
public class ReindexTask implements JsonpSerializable {
	private final String action;

	private final boolean cancellable;

	private final boolean cancelled;

	private final String description;

	private final long id;

	private final String node;

	private final long runningTimeInNanos;

	private final long startTimeInMillis;

	private final ReindexStatus status;

	private final String type;

	private final Map<String, List<String>> headers;

	// ---------------------------------------------------------------------------------------------

	protected ReindexTask(AbstractBuilder<?> builder) {

		this.action = ApiTypeHelper.requireNonNull(builder.action, this, "action");
		this.cancellable = ApiTypeHelper.requireNonNull(builder.cancellable, this, "cancellable", false);
		this.cancelled = ApiTypeHelper.requireNonNull(builder.cancelled, this, "cancelled", false);
		this.description = ApiTypeHelper.requireNonNull(builder.description, this, "description");
		this.id = ApiTypeHelper.requireNonNull(builder.id, this, "id", 0);
		this.node = ApiTypeHelper.requireNonNull(builder.node, this, "node");
		this.runningTimeInNanos = ApiTypeHelper.requireNonNull(builder.runningTimeInNanos, this, "runningTimeInNanos",
				0);
		this.startTimeInMillis = ApiTypeHelper.requireNonNull(builder.startTimeInMillis, this, "startTimeInMillis", 0);
		this.status = ApiTypeHelper.requireNonNull(builder.status, this, "status");
		this.type = ApiTypeHelper.requireNonNull(builder.type, this, "type");
		this.headers = ApiTypeHelper.unmodifiableRequired(builder.headers, this, "headers");

	}

	public static ReindexTask reindexTaskOf(Function<Builder, ObjectBuilder<ReindexTask>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code action}
	 */
	public final String action() {
		return this.action;
	}

	/**
	 * Required - API name: {@code cancellable}
	 */
	public final boolean cancellable() {
		return this.cancellable;
	}

	/**
	 * Required - API name: {@code cancelled}
	 */
	public final boolean cancelled() {
		return this.cancelled;
	}

	/**
	 * Required - API name: {@code description}
	 */
	public final String description() {
		return this.description;
	}

	/**
	 * Required - API name: {@code id}
	 */
	public final long id() {
		return this.id;
	}

	/**
	 * Required - API name: {@code node}
	 */
	public final String node() {
		return this.node;
	}

	/**
	 * Required - API name: {@code running_time_in_nanos}
	 */
	public final long runningTimeInNanos() {
		return this.runningTimeInNanos;
	}

	/**
	 * Required - API name: {@code start_time_in_millis}
	 */
	public final long startTimeInMillis() {
		return this.startTimeInMillis;
	}

	/**
	 * Required - API name: {@code status}
	 */
	public final ReindexStatus status() {
		return this.status;
	}

	/**
	 * Required - API name: {@code type}
	 */
	public final String type() {
		return this.type;
	}

	/**
	 * Required - API name: {@code headers}
	 */
	public final Map<String, List<String>> headers() {
		return this.headers;
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

		generator.writeKey("action");
		generator.write(this.action);

		generator.writeKey("cancellable");
		generator.write(this.cancellable);

		generator.writeKey("cancelled");
		generator.write(this.cancelled);

		generator.writeKey("description");
		generator.write(this.description);

		generator.writeKey("id");
		generator.write(this.id);

		generator.writeKey("node");
		generator.write(this.node);

		generator.writeKey("running_time_in_nanos");
		generator.write(this.runningTimeInNanos);

		generator.writeKey("start_time_in_millis");
		generator.write(this.startTimeInMillis);

		generator.writeKey("status");
		this.status.serialize(generator, mapper);

		generator.writeKey("type");
		generator.write(this.type);

		if (ApiTypeHelper.isDefined(this.headers)) {
			generator.writeKey("headers");
			generator.writeStartObject();
			for (Map.Entry<String, List<String>> item0 : this.headers.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.writeStartArray();
				if (item0.getValue() != null) {
					for (String item1 : item0.getValue()) {
						generator.write(item1);

					}
				}
				generator.writeEnd();

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
	 * Builder for {@link ReindexTask}.
	 */

	public static class Builder extends ReindexTask.AbstractBuilder<Builder> implements ObjectBuilder<ReindexTask> {
		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ReindexTask}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ReindexTask build() {
			_checkSingleUse();

			return new ReindexTask(this);
		}
	}

	public abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>>
			extends
				WithJsonObjectBuilderBase<BuilderT> {
		private String action;

		private Boolean cancellable;

		private Boolean cancelled;

		private String description;

		private Long id;

		private String node;

		private Long runningTimeInNanos;

		private Long startTimeInMillis;

		private ReindexStatus status;

		private String type;

		private Map<String, List<String>> headers;

		/**
		 * Required - API name: {@code action}
		 */
		public final BuilderT action(String value) {
			this.action = value;
			return self();
		}

		/**
		 * Required - API name: {@code cancellable}
		 */
		public final BuilderT cancellable(boolean value) {
			this.cancellable = value;
			return self();
		}

		/**
		 * Required - API name: {@code cancelled}
		 */
		public final BuilderT cancelled(boolean value) {
			this.cancelled = value;
			return self();
		}

		/**
		 * Required - API name: {@code description}
		 */
		public final BuilderT description(String value) {
			this.description = value;
			return self();
		}

		/**
		 * Required - API name: {@code id}
		 */
		public final BuilderT id(long value) {
			this.id = value;
			return self();
		}

		/**
		 * Required - API name: {@code node}
		 */
		public final BuilderT node(String value) {
			this.node = value;
			return self();
		}

		/**
		 * Required - API name: {@code running_time_in_nanos}
		 */
		public final BuilderT runningTimeInNanos(long value) {
			this.runningTimeInNanos = value;
			return self();
		}

		/**
		 * Required - API name: {@code start_time_in_millis}
		 */
		public final BuilderT startTimeInMillis(long value) {
			this.startTimeInMillis = value;
			return self();
		}

		/**
		 * Required - API name: {@code status}
		 */
		public final BuilderT status(ReindexStatus value) {
			this.status = value;
			return self();
		}

		/**
		 * Required - API name: {@code status}
		 */
		public final BuilderT status(Function<ReindexStatus.Builder, ObjectBuilder<ReindexStatus>> fn) {
			return this.status(fn.apply(new ReindexStatus.Builder()).build());
		}

		/**
		 * Required - API name: {@code type}
		 */
		public final BuilderT type(String value) {
			this.type = value;
			return self();
		}

		/**
		 * Required - API name: {@code headers}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>headers</code>.
		 */
		public final BuilderT headers(Map<String, List<String>> map) {
			this.headers = _mapPutAll(this.headers, map);
			return self();
		}

		/**
		 * Required - API name: {@code headers}
		 * <p>
		 * Adds an entry to <code>headers</code>.
		 */
		public final BuilderT headers(String key, List<String> value) {
			this.headers = _mapPut(this.headers, key, value);
			return self();
		}

		protected abstract BuilderT self();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ReindexTask}
	 */
	public static final JsonpDeserializer<ReindexTask> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			ReindexTask::setupReindexTaskDeserializer);

	protected static <BuilderT extends AbstractBuilder<BuilderT>> void setupReindexTaskDeserializer(
			ObjectDeserializer<BuilderT> op) {

		op.add(AbstractBuilder::action, JsonpDeserializer.stringDeserializer(), "action");
		op.add(AbstractBuilder::cancellable, JsonpDeserializer.booleanDeserializer(), "cancellable");
		op.add(AbstractBuilder::cancelled, JsonpDeserializer.booleanDeserializer(), "cancelled");
		op.add(AbstractBuilder::description, JsonpDeserializer.stringDeserializer(), "description");
		op.add(AbstractBuilder::id, JsonpDeserializer.longDeserializer(), "id");
		op.add(AbstractBuilder::node, JsonpDeserializer.stringDeserializer(), "node");
		op.add(AbstractBuilder::runningTimeInNanos, JsonpDeserializer.longDeserializer(), "running_time_in_nanos");
		op.add(AbstractBuilder::startTimeInMillis, JsonpDeserializer.longDeserializer(), "start_time_in_millis");
		op.add(AbstractBuilder::status, ReindexStatus._DESERIALIZER, "status");
		op.add(AbstractBuilder::type, JsonpDeserializer.stringDeserializer(), "type");
		op.add(AbstractBuilder::headers, JsonpDeserializer.stringMapDeserializer(
				JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer())), "headers");

	}

}
