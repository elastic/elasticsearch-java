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

package co.elastic.clients.elasticsearch._types;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.WriteResponseBase
public abstract class WriteResponseBase implements ToJsonp {
	private final String _id;

	private final String _index;

	private final Number _primaryTerm;

	private final JsonValue result;

	private final Number _seqNo;

	private final ShardStatistics _shards;

	@Nullable
	private final String _type;

	private final Number _version;

	@Nullable
	private final Boolean forcedRefresh;

	@Nullable
	private final ErrorCause error;

	// ---------------------------------------------------------------------------------------------

	protected WriteResponseBase(AbstractBuilder<?> builder) {

		this._id = Objects.requireNonNull(builder._id, "_id");
		this._index = Objects.requireNonNull(builder._index, "_index");
		this._primaryTerm = Objects.requireNonNull(builder._primaryTerm, "_primary_term");
		this.result = Objects.requireNonNull(builder.result, "result");
		this._seqNo = Objects.requireNonNull(builder._seqNo, "_seq_no");
		this._shards = Objects.requireNonNull(builder._shards, "_shards");
		this._type = builder._type;
		this._version = Objects.requireNonNull(builder._version, "_version");
		this.forcedRefresh = builder.forcedRefresh;
		this.error = builder.error;

	}

	/**
	 * API name: {@code _id}
	 */
	public String _id() {
		return this._id;
	}

	/**
	 * API name: {@code _index}
	 */
	public String _index() {
		return this._index;
	}

	/**
	 * API name: {@code _primary_term}
	 */
	public Number _primaryTerm() {
		return this._primaryTerm;
	}

	/**
	 * API name: {@code result}
	 */
	public JsonValue result() {
		return this.result;
	}

	/**
	 * API name: {@code _seq_no}
	 */
	public Number _seqNo() {
		return this._seqNo;
	}

	/**
	 * API name: {@code _shards}
	 */
	public ShardStatistics _shards() {
		return this._shards;
	}

	/**
	 * API name: {@code _type}
	 */
	@Nullable
	public String _type() {
		return this._type;
	}

	/**
	 * API name: {@code _version}
	 */
	public Number _version() {
		return this._version;
	}

	/**
	 * API name: {@code forced_refresh}
	 */
	@Nullable
	public Boolean forcedRefresh() {
		return this.forcedRefresh;
	}

	/**
	 * API name: {@code error}
	 */
	@Nullable
	public ErrorCause error() {
		return this.error;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		toJsonpInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("_id");
		generator.write(this._id);

		generator.writeKey("_index");
		generator.write(this._index);

		generator.writeKey("_primary_term");
		generator.write(this._primaryTerm.doubleValue());

		generator.writeKey("result");
		generator.write(this.result);

		generator.writeKey("_seq_no");
		generator.write(this._seqNo.doubleValue());

		generator.writeKey("_shards");
		this._shards.toJsonp(generator, mapper);

		if (this._type != null) {

			generator.writeKey("_type");
			generator.write(this._type);

		}

		generator.writeKey("_version");
		generator.write(this._version.doubleValue());

		if (this.forcedRefresh != null) {

			generator.writeKey("forced_refresh");
			generator.write(this.forcedRefresh);

		}
		if (this.error != null) {

			generator.writeKey("error");
			this.error.toJsonp(generator, mapper);

		}

	}

	protected abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>> {
		private String _id;

		private String _index;

		private Number _primaryTerm;

		private JsonValue result;

		private Number _seqNo;

		private ShardStatistics _shards;

		@Nullable
		private String _type;

		private Number _version;

		@Nullable
		private Boolean forcedRefresh;

		@Nullable
		private ErrorCause error;

		/**
		 * API name: {@code _id}
		 */
		public BuilderT _id(String value) {
			this._id = value;
			return self();
		}

		/**
		 * API name: {@code _index}
		 */
		public BuilderT _index(String value) {
			this._index = value;
			return self();
		}

		/**
		 * API name: {@code _primary_term}
		 */
		public BuilderT _primaryTerm(Number value) {
			this._primaryTerm = value;
			return self();
		}

		/**
		 * API name: {@code result}
		 */
		public BuilderT result(JsonValue value) {
			this.result = value;
			return self();
		}

		/**
		 * API name: {@code _seq_no}
		 */
		public BuilderT _seqNo(Number value) {
			this._seqNo = value;
			return self();
		}

		/**
		 * API name: {@code _shards}
		 */
		public BuilderT _shards(ShardStatistics value) {
			this._shards = value;
			return self();
		}

		/**
		 * API name: {@code _shards}
		 */
		public BuilderT _shards(Function<ShardStatistics.Builder, ObjectBuilder<ShardStatistics>> fn) {
			return this._shards(fn.apply(new ShardStatistics.Builder()).build());
		}

		/**
		 * API name: {@code _type}
		 */
		public BuilderT _type(@Nullable String value) {
			this._type = value;
			return self();
		}

		/**
		 * API name: {@code _version}
		 */
		public BuilderT _version(Number value) {
			this._version = value;
			return self();
		}

		/**
		 * API name: {@code forced_refresh}
		 */
		public BuilderT forcedRefresh(@Nullable Boolean value) {
			this.forcedRefresh = value;
			return self();
		}

		/**
		 * API name: {@code error}
		 */
		public BuilderT error(@Nullable ErrorCause value) {
			this.error = value;
			return self();
		}

		/**
		 * API name: {@code error}
		 */
		public BuilderT error(Function<ErrorCause.Builder, ObjectBuilder<ErrorCause>> fn) {
			return this.error(fn.apply(new ErrorCause.Builder()).build());
		}

		protected abstract BuilderT self();

	}

	// ---------------------------------------------------------------------------------------------
	protected static <BuilderT extends AbstractBuilder<BuilderT>> void setupWriteResponseBaseDeserializer(
			DelegatingDeserializer<BuilderT> op) {

		op.add(AbstractBuilder::_id, JsonpDeserializer.stringDeserializer(), "_id");
		op.add(AbstractBuilder::_index, JsonpDeserializer.stringDeserializer(), "_index");
		op.add(AbstractBuilder::_primaryTerm, JsonpDeserializer.numberDeserializer(), "_primary_term");
		op.add(AbstractBuilder::result, JsonpDeserializer.jsonValueDeserializer(), "result");
		op.add(AbstractBuilder::_seqNo, JsonpDeserializer.numberDeserializer(), "_seq_no");
		op.add(AbstractBuilder::_shards, ShardStatistics.DESERIALIZER, "_shards");
		op.add(AbstractBuilder::_type, JsonpDeserializer.stringDeserializer(), "_type");
		op.add(AbstractBuilder::_version, JsonpDeserializer.numberDeserializer(), "_version");
		op.add(AbstractBuilder::forcedRefresh, JsonpDeserializer.booleanDeserializer(), "forced_refresh");
		op.add(AbstractBuilder::error, ErrorCause.DESERIALIZER, "error");

	}

}
